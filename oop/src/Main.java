import main.Dictionary;
import main.DictionaryManagement;
import main.DictionaryCommandline;

public class Main {
    public static void main(String[] args) {
        DictionaryCommandline dic = new DictionaryCommandline();
        DictionaryManagement dictionaryManagement = new DictionaryManagement();
        Dictionary dictionary = new Dictionary();
        String path = "C:/Users/ADMIN/Desktop/Project_OOP_CML/src/dictionary.txt";
        dic.dictionaryBasic(dictionaryManagement, dictionary,path);
    }
}