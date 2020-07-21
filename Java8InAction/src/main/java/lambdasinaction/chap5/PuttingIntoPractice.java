package lambdasinaction.chap5;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class PuttingIntoPractice{
    @Test
    public void testTransaction(){
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        //1.找出2011年发生的所有交易，并按交易额排序（从低到高）
        List<Transaction> lists = transactions.stream()
                                              .filter(transaction -> transaction.getYear() == 2011)
                                              .sorted(comparing(Transaction::getValue)/*(t1,t2)->t1.getValue()-t2.getValue()*/)
                                              .collect(toList());
        System.out.println(lists.toString());
        System.out.println("----------------");
        //2.交易员都在哪些不同的城市工作过
        List<String> names = transactions.stream()
                .map((transaction) -> transaction.getTrader().getCity())
                .distinct()
                .collect(toList());
        System.out.println(names);
        System.out.println("----------------");
        //3.查找所有来自剑桥的交易员，并按姓名排序
        List<Transaction> cambridges = transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .distinct()
                .sorted(comparing(transaction -> transaction.getTrader().getName()))
                .collect(toList());
        System.out.println(cambridges);
        //4.返回所有交易员的姓名字符串，按字母顺序排序
        List<Trader> traders = transactions.stream()
                .map(transaction -> transaction.getTrader())
                .collect(toList());
        List<String> nameStrings = traders.stream()
                .map(trader -> trader.getName())
                .distinct()
                .sorted(String::compareTo)
                .collect(toList());
        System.out.println(nameStrings);
        List<String> nameStrings2 = transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .sorted(String::compareTo)
                .distinct()
                .collect(toList());
        System.out.println(nameStrings2);

        //5.有没有交易员是在米兰工作的
        boolean milan = transactions.stream()
                .map(Transaction::getTrader)
                .anyMatch(trader -> trader.getCity().equals("Milan"));
        System.out.println(milan);
        //6.打印生活在剑桥的交易员的所有金额
        List<Integer> amounts = transactions.stream()
                .filter(transaction ->
                        transaction.getTrader().getCity().equals("Cambridge")
                ).map(Transaction::getValue)
                .collect(toList());
        System.out.println(amounts);
        //6.1 打印生活在剑桥的交易员的所有金额总和
        Integer sum = transactions.stream()
                .filter(transaction ->
                        transaction.getTrader().getCity().equals("Cambridge")
                ).map(Transaction::getValue)
                .reduce(0, Integer::sum);
        System.out.println("sum = " + sum);
        //7.所有交易中最高的交易金额是多少
        Integer max = transactions.stream()
                .map(transaction -> transaction.getValue())
                .reduce(0, Integer::max);
        System.out.println("max = " + max);
        Integer max2 = transactions.stream()
                .map(transaction -> transaction.getValue())
                .reduce(0,(a,b)-> Integer.max(a,b ));
        System.out.println("max = " + max2);
        //8.找到交易额最小的交易
        Optional<Integer> min = transactions.stream()
                .map(transaction -> transaction.getValue())
                .reduce(Integer::min);
        System.out.println("min = " + min.get());
    }
    public static void main(String ...args){    
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
		
		List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300), 
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),	
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );	
        
        
        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
        List<Transaction> tr2011 = transactions.stream()
                                               .filter(transaction -> transaction.getYear() == 2011)
                                               .sorted(comparing(Transaction::getValue))
                                               .collect(toList());
        System.out.println(tr2011);
        
        // Query 2: What are all the unique cities where the traders work?
        List<String> cities = 
            transactions.stream()
                        .map(transaction -> transaction.getTrader().getCity())
                        .distinct()
                        .collect(toList());
        System.out.println(cities);

        // Query 3: Find all traders from Cambridge and sort them by name.
        
        List<Trader> traders =
            transactions.stream()
                        .map(Transaction::getTrader)
                        .filter(trader -> trader.getCity().equals("Cambridge"))
                        .distinct()
                        .sorted(comparing(Trader::getName))
                        .collect(toList());
        System.out.println(traders);
        
        
        // Query 4: Return a string of all traders’ names sorted alphabetically.
        
        String traderStr = 
            transactions.stream()
                        .map(transaction -> transaction.getTrader().getName())
                        .distinct()
                        .sorted()
                        .reduce("", (n1, n2) -> n1 + n2);
        System.out.println(traderStr);
        
        // Query 5: Are there any trader based in Milan?
        
        boolean milanBased =
            transactions.stream()
                        .anyMatch(transaction -> transaction.getTrader()
                                                            .getCity()
                                                            .equals("Milan")
                                 );
        System.out.println(milanBased);
        
        
        // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
        transactions.stream()
                    .map(Transaction::getTrader)
                    .filter(trader -> trader.getCity().equals("Milan"))
                    .forEach(trader -> trader.setCity("Cambridge"));
        System.out.println(transactions);
        
        
        // Query 7: What's the highest value in all the transactions?
        int highestValue = 
            transactions.stream()
                        .map(Transaction::getValue)
                        .reduce(0, Integer::max);
        System.out.println(highestValue);      
    }
}