package medium;

import java.util.*;

public class JustifyText {



    public static void main(String[] args) {
        String[] text1 = {"It underscores our responsibility",
                "to deal more kindly with one another"};
        int lineLength1 = 35;
        String[] text2 = {"The Earth is",
                "the only world",
                "known so far",
                "to harbor life"};
        int lineLength2 = 18;
        String[] text3 = {"Some modern typesetting programs",
                "offer four justification",
                "options"};
        int lineLength3 = 24;
//
        System.out.println(new JustifyText().justifyText(text1, lineLength1));
        System.out.println(new JustifyText().justifyText(text2, lineLength2));
        System.out.println(new JustifyText().justifyText(text3, lineLength3));
    }

    private List<String> justifyText(String[] text, int lineLength) {


        //Collect all words
        List<String> words = new ArrayList<>();
        for (String line : text) {
            Arrays.asList(line.split(" ")).forEach(word -> words.add(word.trim()));
        }

        List<String> result = new ArrayList<>();

        List<String> toForm = new ArrayList<>();
        int count = 0;
        int size = 0;
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            if (count + word.length() + 1 <= lineLength + 1) {
                toForm.add(word);
                count = count + word.length() + 1;
                size += word.length();
            } else {
                result.add(createLine(toForm, size, lineLength));
                toForm.clear();
                count = 0;
                size = 0;
                i--;
            }
        }

        if (!toForm.isEmpty()) {
            result.add(createLine(toForm, size, lineLength));
        }
        for (String str : result) {
            System.out.println(str);
        }
        System.out.println("\n------------------------\n");

        return result;
    }

    private String createLine(List<String> toForm, int totalLength, int lineLength) {
        if (toForm.size() == 1) {
            return toForm.get(0).trim();
        }

        int spaceRequired = lineLength - totalLength;
        int space = spaceRequired / (toForm.size() - 1);
        int restSpace = spaceRequired % (toForm.size() - 1);


        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < toForm.size(); i++) {

//            if (i == toForm.size() - 2) { //add rest space
//                appendSpace(restSpace, stringBuilder);
//            }
            stringBuilder.append(toForm.get(i));
            if (i == (toForm.size() - 1)) {
                break; // in this case we do not want to append space
            }
            appendSpace(space, stringBuilder);
            if (restSpace-- > 0)  // distribute the space as required.
                appendSpace(1, stringBuilder);
        }

        return stringBuilder.toString();
    }

    private void appendSpace(int space, StringBuilder stringBuilder) {
        while (space-- > 0) {
            stringBuilder.append(" ");
        }
    }

}
