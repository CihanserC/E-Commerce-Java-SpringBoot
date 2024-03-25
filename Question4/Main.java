/*
* Author: Cihanser Çalışkan
*
* Aşağıdaki algoritma için uygun çözümü üretin.
* Java'da 100 adet random sayıya sahip bir liste oluşturun.
* Daha sonra bu listenin bir kopyasını oluşturun.
* 0 ile 100 arasında rastgele bir sayı üretin.
* Kopya listedeki bu random sayının olduğu indisteski değeri silin.
* Şimdi elinizde iki adet liste var ve kopya listede orjinal listeye göre bir eleman eksik.
* Hangi elemanın eksik olduğunu bulan bir metot oluşturun.
* */

import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        // Create random list between [0-99]. No duplicate values.
        Random rnd = new Random();
        List<Integer> originalList = new ArrayList<>();
        for(int index=0; index < 100; index++) { originalList.add( index); }
        Collections.shuffle(originalList);

        // Create a copy list.
        List<Integer> copiedList = new ArrayList<>(originalList);

        //Create a random number between [0-99] and remove value in copy list.
        int randomIndex = rnd.nextInt(100);
        int removedNumber = copiedList.remove(randomIndex);

        System.out.println(originalList);
        System.out.println("Deleted Value: " + removedNumber +" | Deleted Index:" + randomIndex);
        System.out.println("Missing Number: " + findMissingNumber(originalList, copiedList));
    }

    // Compare the two list and return missing number
    public static Integer findMissingNumber(List<Integer> pOriginalList, List<Integer> pCopiedList)
    {
        // n * (n+1) / 2
        int sumOriginalList = 0;
        int sumCopyList = 0;
        for (int i = 0; i < pOriginalList.size(); i++)
        {
            sumOriginalList +=  pOriginalList.get(i);
        }
        for (int i = 0; i < pCopiedList.size(); i++)
        {
            sumCopyList +=  pCopiedList.get(i);
        }

        return sumOriginalList - sumCopyList;
    }
}