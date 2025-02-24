public  class  main{
  public static void main(String[] args) {
        prototype obj = new prototype();
        obj.setPassword("%211kjjk*&&T^$^%#");
        obj.setUsername("hitxzltnm");
        obj.getDataFromDB();

        try {
            prototype obj1= (prototype) obj.clone();
            obj1.setUsername("hitxzltnm1");
            System.out.println(obj.getUsername());
            
        } catch (Exception e) {
            System.out.println("Clone failed");
        }
      

    }
}
