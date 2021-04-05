package hwIOStream;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Menu {
    public static void main(String[] args) {

        /**
         * Два объекта заказ и товар. Должно быть два файла для заказов и товаров.
         * Каждый товар должен иметь ID, название, дату изготовления.
         * Каждый заказ должен иметь по два товара разных.
         * Дату когда оформлялся заказ и ID.
         * С консоли нужно иметь возможность вводить товары,
         * смотреть товары и удалять товары.
         * Тоже самое с заказами.
         * Использовать все что знаете.
         * В файлах должны остаться изменения после окончания работы программы.
         * Программа не закончит работу пока этого не захочит пользователь.
         * */

        //Create file goods and order
        File goodsFile = new File("goods.txt");
        File orderFile = new File("order.txt");

        //create goods list and read data from goods file
        List<Goods> goodsList = new ArrayList<>();
        goodsParser(goodsList, goodsFile);

        //create goods objects
        Goods oranges = new Goods("Oranges", LocalDate.of(2021, 4, 4));
        Goods kiwi = new Goods("Kiwi", LocalDate.of(2021, 3, 25));
        Goods apples = new Goods("Apples", LocalDate.of(2021, 3, 18));
        Goods bananas = new Goods("Bananas", LocalDate.of(2021, 2, 26));
        Goods grapes = new Goods("Grapes", LocalDate.of(2021, 4, 1));

        //create order list and put some goods to this list
        List<Order> orderList = new ArrayList<>();
        Order order1 = new Order(oranges.getID(),LocalDate.of(2021,4,5));
        Order order2 = new Order(kiwi.getID(), LocalDate.of(2021,4,4));
        orderList.add(order1);
        orderList.add(order2);

        //create scanner object
        Scanner scanner = new Scanner(System.in);
        String stringUserNum = "";
        int userNum = 0;

        System.out.println(">>Welcome to Main menu:");
        while (userNum != 3){
            System.out.println(">>Enter 1 to go to Goods menu,");
            System.out.println(">>Enter 2 to go to Order menu,");
            System.out.println(">>Enter 3 to exit Main menu and leave the program");
            System.out.println(">>Make your choice:");
            System.out.println("<< ");
            stringUserNum = scanner.next();
            userNum = Integer.parseInt(stringUserNum);

            if(userNum == 1){
                System.out.println(">>Welcome to Goods menu:");
                while (userNum != 5){
                    System.out.println(">>Enter 1 to see goods,");
                    System.out.println(">>Enter 2 to add goods,");
                    System.out.println(">>Enter 3 to delete goods,");
                    System.out.println(">>Enter 4 to save changes to file,");
                    System.out.println(">>Enter 5 go back to Main menu");
                    System.out.println(">>Make your choice:");
                    System.out.println("<< ");
                    stringUserNum = scanner.next();
                    userNum = Integer.parseInt(stringUserNum);

                    if(userNum == 1){
                        System.out.println("Print all goods:");
                        printGoodsList(goodsList);
                    }else if(userNum == 2){
                        System.out.println(">>Enter goods name:");
                        System.out.println("<<");
                        String goodsName = scanner.next();
                        System.out.println(">>Enter goods date of manufacture:");
                        System.out.println(">>Enter year of manufacture:");
                        System.out.println("<<");
                        String stringYear = scanner.next();
                        int year = Integer.parseInt(stringYear);
                        System.out.println(">>Enter month of manufacture(enter only numbers, 1 or 10): ");
                        System.out.println("<<");
                        String stringMonth = scanner.next();
                        int month = Integer.parseInt(stringMonth);
                        while(month < 1 || month > 12){
                            System.out.println("Incorrect month value: enter positive value from 1 to 12!");
                            System.out.println("<<");
                            stringMonth = scanner.next();
                            month = Integer.parseInt(stringMonth);
                        }
                        System.out.println(">>Enter day of manufacture(enter only numbers, from 1 to 31): ");
                        System.out.println("<<");
                        String stringDay = scanner.next();
                        int day = Integer.parseInt(stringDay);
                        while (day < 1 || day > 31){
                            System.out.println("Incorrect day value: enter positive value from 1 to 31(depends on the current month)!");
                            System.out.println("<<");
                            stringDay = scanner.next();
                            day = Integer.parseInt(stringDay);
                        }
                        Goods goods = new Goods(goodsName, LocalDate.of(year, month, day));
                        goodsList.add(goods);
                    }else if(userNum == 3){
                        System.out.println(">>Enter good`s name to delete it from list:");
                        System.out.println("<<");
                        String stringName = scanner.next();
                        for(Iterator<Goods> iterator = goodsList.iterator(); iterator.hasNext();){
                            Goods goods = iterator.next();
                            if(goods.getName().equalsIgnoreCase(stringName)){
                                iterator.remove();
                            }
                        }
                    }else if(userNum == 4){
                        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("goods.txt"));
                            BufferedReader bufferedReader = new BufferedReader(new FileReader("goods.txt"))){
                            System.out.println("Save all changes to goods file:");
                            String line = "";
                            for(Goods goods : goodsList){
                                line = goods.toString() + "\n";
                                bufferedWriter.write(line);
                            }
                            System.out.println("Done! Goods save to file");
                        }catch (FileNotFoundException e){
                            System.out.println(e.getMessage());
                            e.printStackTrace();
                        }catch (IOException e){
                            System.out.println(e.getMessage());
                            e.printStackTrace();
                        }
                    }else if(userNum == 5){
                        System.out.println("Go back to Main menu!");
                        break;
                    }else{
                        System.out.println("Incorrect argument!");
                    }
                }
            }else if(userNum == 2){
                System.out.println(">>Welcome to Order menu:");
                while (userNum != 5){
                    System.out.println(">>Enter 1 to see orders,");
                    System.out.println(">>Enter 2 to add order,");
                    System.out.println(">>Enter 3 to delete order,");
                    System.out.println(">>Enter 4 to save changes to file,");
                    System.out.println(">>Enter 5 go back to Main menu");
                    System.out.println(">>Make your choice:");
                    System.out.println("<< ");
                    stringUserNum = scanner.next();
                    userNum = Integer.parseInt(stringUserNum);
                    if(userNum == 1){
                        System.out.println("Print all orders:");
                        printObjectList(orderList);
                    }else if(userNum == 2){
                        System.out.println(">>Before entering, make sure that the goods are in the goodsList");
                        System.out.println(">>Enter goods ID:");
                        System.out.println("<<");
                        String stringGoodsID = scanner.next();
                        int goodsID = Integer.parseInt(stringGoodsID);
                        LocalDate localDate = LocalDate.now();
                        Order order = new Order(goodsID, localDate);
                        orderList.add(order);
                    }else if(userNum == 3){
                        System.out.println(">>Before entering, make sure that the goods are in the goodsList");
                        System.out.println(">>Enter good`s ID to delete it from list:");
                        System.out.println("<<");
                        String stringGoodsID = scanner.next();
                        int goodsID = Integer.parseInt(stringGoodsID);
                        for(Iterator<Order> iterator = orderList.iterator(); iterator.hasNext();){
                            Order order = iterator.next();
                            if(order.getGoodsID() == goodsID){
                                iterator.remove();
                            }
                        }
                    }else if(userNum == 4){
                        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(orderFile));
                            BufferedReader bufferedReader = new BufferedReader(new FileReader(goodsFile))){
                            System.out.println("Save all changes to orders file:");
                            String line = "";
                            for(Order order : orderList){
                                line = order.toString() + "\n";
                                bufferedWriter.write(line);
                            }
                            System.out.println("Done! Orders save to file");
                        }catch (FileNotFoundException e){
                            System.out.println(e.getMessage());
                            e.printStackTrace();
                        }catch (IOException e){
                            System.out.println(e.getMessage());
                            e.printStackTrace();
                        }
                    }else if(userNum == 5){
                        System.out.println("Go back to Main menu!");
                        break;
                    }else{
                        System.out.println("Incorrect argument!");
                    }
                }
            }else if(userNum == 3){
                System.out.println("Have o good day !!!");
            }else {
                System.out.println("Incorrect argument! Please enter positive number: ");
            }
        }
        scanner.close();
    }//main ends

    /* static methods */
    //#1
    public static void printGoodsList(List<Goods> list){
        for(Goods goods : list)
            System.out.println(goods);
    }

    //#2
    public static void printOrdersList(List<Order> list){
        for(Order order : list)
            System.out.println(order);
    }

    //#3
    public static <T>void printObjectList(List<T> list){
        for (T object : list)
            System.out.println(object);
    }

    //#4
    public static List<Goods> goodsParser(List<Goods> list, File filename){
        String[] goodsComponents;
        List<String> stringList = new ArrayList<>(10);
        String line = "";
        File goodsFile = new File("goods.txt");
        try( BufferedReader bufferedReader = new BufferedReader(new FileReader(goodsFile))){
            while ((line = bufferedReader.readLine()) != null){
                //line = //bufferedReader.readLine();
                goodsComponents = (line.split("/"));
                for(int i = 0; i < goodsComponents.length; i++){
                    stringList.add(goodsComponents[i]);
                }
                goodsComponents = null;
                line = "";
            }

            int id = -1;
            String goodsName = "";
            int year = -1;
            int month = -1;
            int day = -1;
            int[] dateArray = new int[3];
            for(int i = 0; i < stringList.size(); ){
                id = findID(stringList.get(i));
                goodsName = findGoodsName(stringList.get(i+1));
                dateArray = findDate(stringList.get(i+2));
                year = dateArray[0];
                month = dateArray[1];
                day = dateArray[2];
                list.add(new Goods(goodsName, LocalDate.of(year,month,day)));
                i = i+3;
            }

        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch (IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return list;
    }

    //#5
    public static int findID(String line){
        int result = -1;
        String idString = "";

        Pattern patternID = Pattern.compile("[id=]\\d+$");
        Matcher matcher = patternID.matcher(line);

        if(matcher.find()){
            idString = matcher.group();
            idString = idString.substring(1);
            result = Integer.parseInt(idString);
        }

        return result;
    }

    //#6
    public static String findGoodsName(String line){
        String result = "";

        Pattern patternGoodsName = Pattern.compile("[name=a-zA-Z]");
        Matcher matcher = patternGoodsName.matcher(line);

        while(matcher.find()){
            result += matcher.group();
            //result = result.substring(4);
        }
        result = result.substring(5);
        return result;
    }

    //#7
    public static int[] findDate(String line){
        int[] dateArray = new int[3];
        String date = "";
        int intDate = -1;
        int index = 0;

        Pattern patternDate = Pattern.compile("\\d+");
        Matcher matcher = patternDate.matcher(line);

        while (matcher.find()){
            date = matcher.group();
            intDate = Integer.parseInt(date);
            dateArray[index++] = intDate;
        }
        return dateArray;
    }

}//class ends
