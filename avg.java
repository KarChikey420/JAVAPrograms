class avg{
              public static void main(String[] args)
              {
                int mk1=Integer.parseInt(args[0]);
                int mk2=Integer.parseInt(args[1]);
                int mk3=Integer.parseInt(args[2]);
                int avg=(mk1+mk2+mk3)/3;

                if(avg>75)
                {
                  System.out.println("Exelent");
                }
                else if(avg>=70 && avg<75)
                {
                  System.out.println("Very good");
                }
                else if(avg>=60 && avg>70)
                {
                  System.out.println("Good");
                }
                else
                {
                  System.out.println("Fail");
                }
              }
           }