package Searching;

public class Sequential_Search {
    
    public static void Search(int data[],int cari){
        //menghitung banyak data yang sama
        int count=0;
        for(int i=0; i<data.length; i++){
            if(cari==data[i]){
                count++;
                // System.out.println("Data "+cari+" Berada di Index "+i);
            }
        }

        //mencari index berapa data yg sama
        int idx[] = new int[count];
        int j=0;
        if(count > 0){
        for(int i=0; i<data.length; i++){
            if(cari==data[i]){
                idx[j]=i;
                j++;
            }
        }
    }

        //sysout
        for(int k=0; k<count; k++){
            // if(count > 0){
            System.out.println("Angka "+cari+" berada di index "+idx[k]+" ");
            // }else{
            //     System.out.println(cari+" tidak ditemukan");
            // }
        }
    }


    public static void main(String[] args){
        int data[] = {2,3,2,2,5,2,4};
        int cari = 2;
        Search(data, cari);
    }
}
