public class Skat3
// public class: kommenterer klassen
{
        public static void main(String[] args){
            //
            int indkomst = 120000;
            double ambi, pension, bundskat;
            int personfradrag = 33400;


            ambi = indkomst * 8.0 / 100.0;
            pension = indkomst * 1.0 / 100.0;

            bundskat = (indkomst - (ambi + pension + personfradrag))*0.07;

            System.out.print("Arbejdsmarkedsbidrag: ");
            System.out.println(ambi);
            System.out.print("Særlig pensionsopsparing: ");
            System.out.println(pension);
            System.out.print("bundskat:");
            System.out.println(bundskat);
        }
    }


