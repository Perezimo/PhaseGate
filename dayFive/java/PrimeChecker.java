
public class PrimeChecker{
public static void main(String [] args){

   int primechecker = 0;

    for(int number = 0; number <= 100; number++){

            for (int check = 1; check <=number; check ++){

                     if(check % number ==0){

                             primechecker++;

                    }

           if(primechecker==2);{

                         System.out.println(number);

                }
            }    

        }
    }

}

