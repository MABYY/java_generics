package org.javasql;

public class Main {
    public static void main(String[] args) {

      var list =   new GenericList<Integer>();
      list.add(1);
      Integer num = list.get(0);
      System.out.println(num );


      var user1 = new User(1);
      var user2 = new User(5);

      if(user1.compareTo(user2)<0){
          System.out.println("User1 is lower than User2");
      } else {
          System.out.println("User2 is lower than User1");
      }

      var res = Utils.maxfind(new User(10), new User(5));
      System.out.println(res);


      User newUser = new Instructor(10);
      Utils.printUser(newUser);


      var user = new GenericList<User>();

    }
}