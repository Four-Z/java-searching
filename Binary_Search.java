package Searching;

public class Binary_Search {

    public static int search(int data[], int cari){
        int kiri = 0;
        int kanan = data.length-1;

        while(kiri <= kanan){
            int tengah = (kiri+kanan)/2;
            if(cari < data[tengah]){
                kanan = tengah-1;
            }else if(cari > data[tengah]){
                kiri = tengah+1;
            }else if(cari == data[tengah]){
                return tengah;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        //S&K data must be sorted
        int data[] = {1,3,5,8,10,12,13,15,20,31};
        int cari = 31;

        System.out.println(cari+" berada di index ke-"+search(data,cari));
}
}