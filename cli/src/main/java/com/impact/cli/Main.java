package com.impact.cli;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import java.util.concurrent.Callable;

@Command(name = "impact-cli", mixinStandardHelpOptions = true, version = "1.0.0",
        description = "A tiny CLI that prints 'impact' in ASCII")
public class Main implements Callable<Integer> {

    @Command(name = "banner", description = "Print ASCII 'impact'")
    static class Banner implements Callable<Integer> {
        @Override
        public Integer call() {
            String banner = String.join("\n",
                "  ___                              _   ",
                " |_ _| _ __ ___    __ _   _ __    | |_ ",
                "  | | | '_ ` _ \\  / _` | | '_ \\   | __|",
                "  | | | | | | | || (_| | | |_) |  | |_ ",
                " |___||_| |_| |_| \\__,_| | .__/    \\__|",
                "                         |_|           ",
                "                impact                 "
            );
            System.out.println(banner);
            return 0;
        }
    }

    public static void main(String[] args) {
        int code = new CommandLine(new Main())
                .addSubcommand(new Banner())
                .execute(args);
        System.exit(code);
    }

    @Override
    public Integer call() {
        System.out.println("Usage: banner");
        return 0;
    }
}
