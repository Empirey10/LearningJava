  import java.util.Scanner;
 public class Variabel {

    public static void main(String[] args) throws Exception 
    {
    Scanner input = new Scanner(System.in);
       int dataA, dataB, dataC, dataD, dataE, choice, result= 0;
      
     System.out.println("Program Kalkulator Sederhana");
     System.out.println("1. Penjumlahan");
     System.out.println("2. Pengurangan");
     System.out.println("3. Pembagian");
     System.out.println("4. Perkalian");
     System.out.println("5. Sisa Bagi");
     System.out.println("--------------------------------");


     // input data
     System.out.print("Masukan Data A: ");
     dataA = input.nextInt();
     System.out.print("Masukan Data B: ");
     dataB = input.nextInt();
     
     // Pilihan Operasi
     System.out.print("Masukan Operasi: ");
     choice = input.nextInt();
    
       switch (choice)
       {
       case 1 : result = dataA + dataB; break;
       case 2 : result = dataA - dataB; break;
       case 3 : result = dataA / dataB; break;
       case 4 : result = dataA * dataB; break;
       case 5 : result = dataA % dataB; break;
       default : System.out.println("Salah Memasukan Pilihan Harap Baca Pilihan di Menu");
     }
     System.out.println("Hasil: " + result);
     System.out.println("-------------------------------");
     
  
      
     // input data
     System.out.print("Masukan Data C: ");
     dataC = input.nextInt();
     System.out.print("Masukan Data D: ");
     dataD = input.nextInt();

     // Pilihan Operasi
     System.out.print("Masukan Operasi: ");
     choice = input.nextInt();

     switch (choice)
     {
       case 1 : result = dataC + dataD; break;
       case 2 : result = dataC - dataD; break;
       case 3 : result = dataC / dataD; break;
       case 4 : result = dataC * dataD; break;
       case 5 : result = dataC % dataD; break;
       default : System.out.println("Salah Memasukan Pilihan Harap Baca Pilihan di Menu");

      }
      System.out.println("Hasil: " + result);
      System.out.println("-------------------------------");
    
      
     // input data
     System.out.print("Masukan Data C: ");
     dataC = input.nextInt();
     System.out.print("Masukan Data E: ");
     dataE = input.nextInt();
     

     // Pilihan Operasi
     System.out.print("Masukan Operasi: ");
     choice = input.nextInt();

     switch (choice)
     {
       case 1 : result = dataC + dataE; break;
       case 2 : result = dataC - dataE; break;
       case 3 : result = dataC / dataE; break;
       case 4 : result = dataC * dataE; break;
       case 5 : result = dataC % dataE; break;
       default : System.out.println("Salah Memasukan Pilihan Harap Baca Pilihan di Menu");

      }
      System.out.println("Hasil: " + result);
    }
 }

   
 







 
 
    