package day12.stream;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static day12.stream.Menu.menuList;

// map : 리스트에서 원하는 데이터만 추출
// original : [ {}, {}, {}, {}, {}, ]
// filter   : [ {}, {}, {} ]  갯수가 줄어듬 내용은 객체그대로
// mapping : [ "", "", "", "", "" ]  갯수는 오리지날그대로, 내용이 바뀜
public class Mapping {


    public static void main(String[] args) {

        List<String> nameList = menuList
                .stream()
                .map(dish -> dish.getName())
                .collect(Collectors.toList());

        System.out.println(nameList);

        System.out.println("==========================");

        List<String> words = List.of(
                "safari", "chrome", "ms edge"
                , "opera", "firefox"
        );

        // [ ?, ?,? ...]

        List<Integer> collected = words.stream()
                .map(w -> w.length())
                .collect(Collectors.toList());

        System.out.println(collected);


        List<Character> characterList = words.stream()
                .map(w -> w.charAt(0)) // charAt(index): 문자열에서 해당위치 글자 추출
                .collect(Collectors.toList());
        System.out.println(characterList);

        // 메뉴 목록에서 메뉴이름과 칼로리를 추출해서
        // 새로운 객체에 포장하고 싶음
        /*

                const menuList = [
                   {
                       name: 'pork",
                       isVegeterian: false,
                       calories: 800,
                       type: 'MEAT'

                    },
                    ...
                ];
                const nameList = ['pork', 'beef', 'chicken' ...]
         */

        List<SimpleDish> simpleDishList = menuList
                .stream()
                .map(dish -> new SimpleDish(dish))
                .collect(Collectors.toList());

        simpleDishList.forEach((sd -> System.out.println(sd)));

    }
}
