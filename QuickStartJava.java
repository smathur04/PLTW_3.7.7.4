import core.data.*; 

public class QuickStartJava {
    public static void main(String[] args) {
        DataSource ds = DataSource.connect("archive/PGATOUR_data2.csv");
        ds.load();

        String[] names = ds.fetchStringArray("Player");
        System.out.println("Names and Ages of 2017 PGA Tour Players: ");

        for(int i = 0; i < 70; i++){
            ds = DataSource.connect("archive/PGATOUR_data2.csv");
            ds.load();    
    
            names = ds.fetchStringArray("Player");
            System.out.print("Name: " + names[i]);
    
            ds = DataSource.connect("archive/PGATOUR_meta2.csv");
            ds.load();
    
            String[] ages = ds.fetchStringArray(names[i]);
            System.out.println(" |||| Age: " + ages[67]);
        }

    }
}