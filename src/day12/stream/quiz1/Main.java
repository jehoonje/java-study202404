package day12.stream.quiz1;

import java.util.*;
import java.util.stream.Collectors;



public class Main {

    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = List.of(
                new Transaction(brian, 2021, 300),
                new Transaction(raoul, 2022, 1000),
                new Transaction(raoul, 2021, 400),
                new Transaction(mario, 2021, 710),
                new Transaction(mario, 2022, 700),
                new Transaction(alan, 2022, 950)
        );

        // 연습 1: 2021년에 발생한 모든 거래를 찾아 거래액 오름차 정렬(작은 값에서 큰 값).
        // List<Transaction>
        List<Transaction> LowToHighValueInYear = transactions.stream()
                .filter(t -> t.getYear() == 2021)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());

        System.out.println(LowToHighValueInYear);



        // 연습 2: 거래자가 근무하는 모든 도시이름을 중복 없이 나열하시오.
        // List<String>

        transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct() // 중복 없이
                .forEach(System.out::println);



        // 연습 3: Cambridge에 근무하는 모든 거래자를 찾아 거래자리스트로 이름순으로 오름차정렬.
        // List<Trader>

        List<String> cambridge = transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(transaction -> transaction.getTrader().getName())
                .sorted()  // 맵핑하면 문자열로 나와서 정렬기준이 필요없음
                .distinct()
                .collect(Collectors.toList());

        System.out.println(cambridge);


        // 연습 4: 모든 거래자의 이름을 리스트에 모아서 알파벳순으로  오름차정렬하여 반환
        // List<String>

        List<String> traderSort = transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .sorted()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(traderSort);


        // 연습 5: Milan에 거주하는 거래자가 한명이라도 있는지 여부 확인?

        boolean milan = transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equalsIgnoreCase("Milan"));

        System.out.println(milan);





        // 연습 6: Cambridge에 사는 거래자의 모든 거래액의 총합 출력.

        int cambridgeTotal = transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equalsIgnoreCase("Cambridge"))
                .mapToInt(transaction -> transaction.getValue())// Transaction::getValue
                .sum();

        System.out.println(cambridgeTotal);


        // 연습 7: 모든 거래에서 최고거래액은 얼마인가?
        int max = transactions.stream()
                .mapToInt(Transaction::getValue)
                .max()
                .getAsInt(); // max 쓸 때는 얘가 있어야됨

        System.out.println(max);

    /*

        자바의 단점 : 널 체크 문법이 없음

     */

        // 연습 8. 가장 작은 거래액을 가진 거래정보 탐색
        int min = transactions.stream()
                .mapToInt(Transaction::getValue)
                .min()
                .orElse(0); // 결과가 null 일 경우 어쩔거임

        System.out.println(min);


        // 연습 9. 거래액이 500 이상인 거래들만 필터링하고, 해당 거래의 정보를 출력하시오.

        List<Transaction> moreThan500 = transactions.stream()
                .filter(transaction -> transaction.getValue() >= 500)
                .collect(Collectors.toList());

        moreThan500.forEach(System.out::println);

        // 연습 10. 모든 거래에서 가장 작은 거래액보다 큰 거래액을 가진 거래의 평균을 계산하시오.
        // 출력값: 752.0
        int minValue = transactions.stream()
                .mapToInt(Transaction::getValue)
                .min()
                .getAsInt();
        OptionalDouble average = transactions.stream()
                .mapToInt(Transaction::getValue)
                .filter(value -> value > minValue)
                .average(); // 평균 계산

        System.out.println(average.orElse(0));



        // 연습 11. "Cambridge"에서 거래하는 모든 거래자의 거래액을 연도별로 그룹화하여 출력하시오.
        /*
               출력예시

                Year: 2021
                {Trader: Brian in Cambridge, year: 2021, value: 300}
                {Trader: Raoul in Cambridge, year: 2021, value: 400}

                Year: 2022
                {Trader: Raoul in Cambridge, year: 2022, value: 1000}
                {Trader: Alan in Cambridge, year: 2022, value: 950}
         */
        List<Transaction> cambridge2021 = transactions.stream()
                .filter(t -> t.getTrader().getCity().equalsIgnoreCase("cambridge") && t.getYear() == 2021)
                .collect(Collectors.toList());

        List<Transaction> cambridge2022 = transactions.stream()
                .filter(t -> t.getTrader().getCity().equalsIgnoreCase("cambridge") && t.getYear() == 2022)
                .collect(Collectors.toList());

        // 결과 출력
        System.out.println("Year: 2021");
        cambridge2021.forEach(transaction -> System.out.println(String.format("{Trader: %s in %s, year: %d, value: %d}",
                transaction.getTrader().getName(),
                transaction.getTrader().getCity(),
                transaction.getYear(),
                transaction.getValue())));
        System.out.println();
        System.out.println("Year: 2022");
        cambridge2022.forEach(transaction -> System.out.println(String.format("{Trader: %s in %s, year: %d, value: %d}",
                transaction.getTrader().getName(),
                transaction.getTrader().getCity(),
                transaction.getYear(),
                transaction.getValue())));
//
//        System.out.println(cambridge1);



        // 연습 12. 모든 거래 중 가장 큰 거래액과 가장 작은 거래액의 차이를 계산하시오.
        // 출력 값 : 700

        System.out.println(max - minValue);
    }
}
