/*
 * This source file was generated by the Gradle 'init' task
 */
package bitcamp.project3;

import bitcamp.project3.command.DayOverCommand;
import bitcamp.project3.command.GuestCommand;
import bitcamp.project3.command.OperationCommand;
import bitcamp.project3.menu.MenuGroup;
import bitcamp.project3.menu.MenuItem;
import bitcamp.project3.vo.*;

import java.util.ArrayList;
import java.util.List;

public class App {
  static public List<BookInfo> bookList = new ArrayList<>();
  static public List<Guest> guests = new ArrayList<>();
  static public StoreInfo storeInfos = new StoreInfo();
  List<RentInfo> rentInfos = new ArrayList<>();
  GuestCommand guestCommand = new GuestCommand(bookList, rentInfos, storeInfos, guests);
  OperationCommand operationCommand = new OperationCommand(bookList, rentInfos, storeInfos);
  DayOverCommand dayOverCommand = new DayOverCommand(storeInfos);
  MenuGroup mainMenu = new MenuGroup("메인");

  private App() {
    setData(bookList, guests);
    MenuGroup guestMenu = new MenuGroup("손님받기", guestCommand);
    guestMenu.add(new MenuItem("빌려준다", guestCommand));
    guestMenu.add(new MenuItem("거절한다", guestCommand));
    mainMenu.add(guestMenu);

    MenuGroup operationMenu = new MenuGroup("운영관리");
    operationMenu.add(new MenuItem("재고조회", operationCommand));
    operationMenu.add(new MenuItem("서점가기", operationCommand));
    operationMenu.add(new MenuItem("대출현황", operationCommand));
    mainMenu.add(operationMenu);

    mainMenu.add(new MenuItem("일과정산", dayOverCommand));

    //MenuGroup adminMenu = new MenuGroup("관리자메뉴");
    mainMenu.setExitMenuTitle("종료");
  }

  public static void main(String[] args) {
    new App().execute();
  }

  private void setData(List<BookInfo> bookList, List<Guest> guests) {
    bookList.add(new BookInfo("귀멸의칼날1", 2, 10));
    bookList.add(new BookInfo("원피스", 3, 10));
    bookList.add(new BookInfo("코난", 1, 10));
    bookList.add(new BookInfo("귀멸의칼날4", 5, 10));
    bookList.add(new BookInfo("귀멸의칼날5", 6, 10));
    guests.add(new Kid());
    guests.add(new NoJob());
    guests.add(new Grandpa());
    guests.add(new Student());

  }

  public void execute() {
    try {
      mainMenu.execute();
    } catch (Exception ex) {
      System.out.println("실행 오류!");
    }
  }
}
