import main.Dictionary;
import main.DictionaryManagement;
import main.DictionaryCommandline;

public class Main {
    public static void main(String[] args) {
        DictionaryCommandline dic = new DictionaryCommandline();
        DictionaryManagement dictionaryManagement = new DictionaryManagement();
        Dictionary dictionary = new Dictionary();
        String path = "CML/oop/src/main/dictionary.txt";
        dic.dictionaryAdvanced(dictionaryManagement, dictionary,path);
    }
}