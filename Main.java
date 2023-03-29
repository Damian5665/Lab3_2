class Main {
  public static void main(String[] args) {
    int i,a;
    for(i=1;i<=10;i++)
      {
        for(a=1;a<=10;a++)
          {
            if(a==i||i==1||i==10||a==1||a==10)
            {
              System.out.print("*");
            }
            else
            {
              System.out.print(" ");
            }
          }
        System.out.print("\n");
      }
  }
}