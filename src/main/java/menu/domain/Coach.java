package menu.domain;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Coach {
    private String name;
    private List<String> prohibitionMenus = new ArrayList<String>();
    private List<String> recommendMenus = new ArrayList<String>();

    public Coach(String name) {
        if(!(2 <= name.length() && name.length() <= 4)) {
            throw new IllegalArgumentException("[ERROR] 코치의 이름은 2글자 이상 4글자 이하입니다.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setProhibitionMenus(String menus) {
        //TODO Category 메뉴에 없는 메뉴일시 올바르게 입력받기
        String[] inputProhibitionMenus = menus.split(",");
        if(!(0 <= inputProhibitionMenus.length && inputProhibitionMenus.length == 2)) {
            throw new IllegalArgumentException("못먹는 메뉴는 0개에서 2개 범위를 넘을 수 없습니다.");
        }
        if(inputProhibitionMenus.length != (new HashSet<String>(List.of(inputProhibitionMenus))).size()) {
            throw new IllegalArgumentException("[ERROR] 중복을 제거해주세요");
        }
        if(menus.equals("")) {
            return;
        }
        for(String menu : inputProhibitionMenus) {
            prohibitionMenus.add(menu);
        }

    }


}
