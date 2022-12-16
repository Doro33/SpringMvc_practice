package ir.maktab.hospital.utils;

import java.util.List;

public class AppContext {
    private AppContext() {
    }


    public static void listPrinter(List input) {
        if (input.isEmpty())
            System.out.println("The list is empty.");
        for (int i = 0; i < input.size(); i++)
            System.out.println(i + 1 + ") " + input.get(i));
    }

    public static void doneReaction() {
        System.out.println("Done.");
        System.out.println("Press Enter To Continue");
        try {
            System.in.read();
        } catch (Exception ignored) {
        }
    }
}