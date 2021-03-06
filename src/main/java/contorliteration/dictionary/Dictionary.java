package contorliteration.dictionary;

import java.util.ArrayList;
import java.util.List;

public class Dictionary {

    List<DictionaryItem>dictionaryItems = new ArrayList<>();

    public void addItem(String word, List<String>translations){
        boolean found = false;
        for(DictionaryItem dictionaryItem : dictionaryItems) {
            if (dictionaryItem.getWord().equals(word)) {
                dictionaryItem.addTranslations(translations);
                found = true;
            }
        }
            if(!found){
                dictionaryItems.add(new DictionaryItem(word, translations));
            }
        }


    public List<String> findTranslations(String word) {
        for (DictionaryItem dictionaryItem : dictionaryItems) {
            if (dictionaryItem.getWord().equals(word)) {
                return dictionaryItem.getTranslations();
            }
        }
        return new ArrayList<>();
    }


        public List<DictionaryItem> getDictionaryItems () {
            return dictionaryItems;
        }
    }
