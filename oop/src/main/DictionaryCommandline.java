package main;

import java.util.*;

public class DictionaryCommandline {
    public void showAllWords(DictionaryManagement dictionaryManagement, Dictionary dictionary) {
        String str= "";
        str += "No\t|\t\tEnglish\t\t|\t\tVietnamese \n";
        int n = 1;
        TreeMap<String, Pair<String, Integer>> sorted = new TreeMap<String, Pair<String, Integer>>(dictionaryManagement.mp);
        Set<Map.Entry<String, Pair<String, Integer>>> mappings = sorted.entrySet();
        for (Map.Entry<String, Pair<String, Integer>> mapping : mappings) {
            str += n + "\t|\t\t" + mapping.getKey() + "\t\t|\t\t" + mapping.getValue().getKey() + "\n";
            n++;
        }
        System.out.println(str);
    }
    public void dictionaryBasic(DictionaryManagement dictionaryManagement, Dictionary dictionary, String path) {
        dictionaryManagement.insertFromCommandline(path,dictionary);
        showAllWords(dictionaryManagement, dictionary);
    }
}