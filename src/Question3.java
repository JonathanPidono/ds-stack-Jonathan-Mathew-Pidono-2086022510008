   import java.util.Scanner;
   import java.util.Stack;

   public class Question3 {
      public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         solution t = new solution();

         if (sc.hasNextInt()) {
            int caseNum = sc.nextInt();
            Stack<Integer> timeline = new Stack<>();

            for (int i = 0; i < caseNum; i++) {
               timeline.push(sc.nextInt());
            }

            String hasilAkhir = "";
            int akumulasiDistorsi = 0;

            while (!timeline.isEmpty()) {
               int targetAsli = timeline.pop();
               int targetKompensasi = targetAsli + akumulasiDistorsi;
               String rute = t.testcase3(targetKompensasi);

               int jumlahPlusDiRute = 0;
               for (int i = 0; i < rute.length(); i++) {
                  if (rute.charAt(i) == '+') {
                     jumlahPlusDiRute++;
                  }
               }

               akumulasiDistorsi += jumlahPlusDiRute;
               hasilAkhir = rute + hasilAkhir;
            }

            System.out.println(hasilAkhir);
         }

         sc.close();
      }
   }

   class solution {
      public String testcase3(int target) { // implementasi stack utama di sini
         Stack<String> stack = new Stack<>();
         String result = "";

         while (target > 1) {
            if (target % 2 == 0) {
               target /= 2;
               stack.push("d+");
            } else {
               target -= 1;
               stack.push("1+");
            }
         }
         if (target == 1) {
            result += "1";
         }

         while (!stack.isEmpty()) {
            result += stack.pop();
         }

         return result;
      }
   }