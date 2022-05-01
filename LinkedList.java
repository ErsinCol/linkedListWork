public class LinkedList {
    public Dugum baslangic;

    public LinkedList(){
        baslangic=null;
    }

    public void sonaEkle(int deger){
        Dugum eklenecekDugum=new Dugum(deger);

        // eger daha önce hiç düğüm eklenmemişse başlangıç düğümüne ekle
        if(baslangic==null){
            baslangic=eklenecekDugum;
            return;
        }
        // son düğümü bul onun sonuna ekle
        Dugum tmp=baslangic;
        while(tmp.sonrakiDugum!=null){
            tmp=tmp.sonrakiDugum;
        }
        tmp.sonrakiDugum=eklenecekDugum;
    }

    public void yazdir(){
        Dugum tmp=baslangic;
        while(tmp!=null){
            System.out.println(tmp.veri);
            tmp=tmp.sonrakiDugum;
        }
    }
}
