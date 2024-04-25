package main;
import java.io.File;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DictionaryManagement {
    protected Map<String, Pair<String, Integer>> mp = new HashMap<>();
    protected Trie trie = new Trie();

    public void addAllTrie(Dictionary dictionary) {
        try {
            for (Word w : dictionary) {
                trie.insert(w.getWord_target());
            }
        } catch (NullPointerException e) {
            System.out.println("Rỗng!");
        }
    }

    public void insertFromCommandline(String path ,Dictionary dictionary) {
        File f = new File(path);
        try {
            List<String> allText = Files.readAllLines(f.toPath(), StandardCharsets.UTF_8);
            for (String line : allText) {
                String[] word = line.split(" : ");
                String eng = word[0];
                String vie = word[1];
                Word w = new Word(eng, vie);
                mp.put(eng, new Pair(vie, dictionary.size()));
                dictionary.add(w);
            }
            addAllTrie(dictionary);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}