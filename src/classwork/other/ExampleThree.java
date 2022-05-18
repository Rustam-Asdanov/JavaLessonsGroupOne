package classwork.other;

import java.io.*;

public class ExampleThree {
    public static void main(String[] args) {

//        File myFile = new File("src/classwork/other/test_folder_one/test.txt");
//
//        if(myFile.exists()){
//            System.out.println("exist");
//        } else {
//            System.out.println("not exist");
//        }
//
//        System.out.println(myFile.isDirectory());
//        System.out.println(myFile.isFile());
//        System.out.println(myFile.isAbsolute());
//
//        File myFile = new File("src/classwork/other/test_folder_one/file.txt");
//
//            try {
//                String fileName = myFile.getName();
//                if(myFile.createNewFile()){
//                    System.out.println(fileName+ " created");
//                }else{
//                    System.out.println(fileName+" exist");
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
////        System.out.println(myFile.delete());
//        System.out.println(myFile.lastModified());

//        String location = "src/classwork/other/test_folder_one/";
//        String fileRootName = "marvel";
//
//        for(int i=1; i<=3;i++){
//            String pathname = location + fileRootName + "_" +i + ".txt";
//            System.out.println(pathname);
//            File myFile = new File(pathname);
//            try {
//                myFile.createNewFile();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

        File special_file = new File("src/classwork/other/test_folder_one/test.txt");

        System.out.println(special_file.length());

        try {
            FileWriter fileWriter = new FileWriter(special_file,false);

            String[] characters = {"Iron Man", "Capitan America", "Hulk", "Thor", "Spider Man"};

            for(String c : characters){
                fileWriter.write(c);
                fileWriter.append('\n');
            }

            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(special_file.length());

        try {
            BufferedReader reader = new BufferedReader(new FileReader(special_file));

            String text = "";
            while ( (text = reader.readLine()) != null){
                System.out.println(text);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

// folder test_folder
// create file my_numbers.txt
// if file exists
// get name of file
// delete file

