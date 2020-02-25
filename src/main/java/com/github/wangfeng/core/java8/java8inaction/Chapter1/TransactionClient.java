package com.github.wangfeng.core.java8.java8inaction.Chapter1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TransactionClient {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        //1. 2001年发生的交易,按交易额排序（从低到高）
        List<Transaction> transaciton2011 = transactions.stream().filter(d -> d.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getYear))
                .collect(Collectors.toList());
        System.out.println(transaciton2011);
        //2. 交易员都在哪些不同城市工作过
        List<String> distinctCities = transactions.stream().map(Transaction::getTrader).map(Trader::getCity).distinct().collect(Collectors.toList());
        System.out.println(distinctCities);
        //3. 查找所有来源于剑桥的交易员，并按照姓名排序
        List<String> cambridgeTrader = transactions.stream().map(Transaction::getTrader).filter(trader -> trader.getCity().equals("Cambridge"))
                .sorted(Comparator.comparing(Trader::getName)).map(Trader::getName).distinct().collect(Collectors.toList());
        System.out.println(cambridgeTrader);
        //4. 返回所有交易员名单并按姓名排序
        List<String> allTraders = transactions.stream().map(Transaction::getTrader).map(Trader::getName).distinct().sorted(Comparator.comparing(String::valueOf)).collect(Collectors.toList());
        System.out.println(allTraders);
        //5. 有没有交易员是来自米兰的
        System.out.println(transactions.stream().map(Transaction::getTrader).anyMatch(trader -> trader.getCity().equals("Milan")));
        //6. 打印生活在剑桥的所有交易员的交易额
        transactions.stream().filter(t -> t.getTrader().getCity().equals("Cambridge")).map(Transaction::getValue).forEach(System.out::println);
        //7. 所有交易中，交易额最高的是多少
        System.out.println("交易额最高：" + transactions.stream().map(Transaction::getValue).reduce(Integer::max).get());


    }
}
