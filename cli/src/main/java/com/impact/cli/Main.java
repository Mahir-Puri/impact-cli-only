package com.impact.cli;

import picocli.CommandLine;
import picocli.CommandLine.Command;

import java.util.concurrent.Callable;

@Command(name = "impact-cli", mixinStandardHelpOptions = true, version = "1.0.0",
        description = "A CLI that prints 'impact.com' in ASCII")
public class Main implements Callable<Integer> {

    @Command(name = "banner", description = "Print ASCII 'impact.com'")
    static class Banner implements Callable<Integer> {
        @Override
        public Integer call() {
            String banner = String.join("\n",
                " /$$                                               /$$    ",
                "|__/                                              | $$    ",
                " /$$ /$$$$$$/$$$$   /$$$$$$   /$$$$$$   /$$$$$$$ /$$$$$$  ",
                "| $$| $$_  $$_  $$ /$$__  $$ |____  $$ /$$_____/|_  $$_/  ",
                "| $$| $$ \\ $$ \\ $$| $$  \\ $$  /$$$$$$$| $$        | $$    ",
                "| $$| $$ | $$ | $$| $$  | $$ /$$__  $$| $$        | $$ /$$",
                "| $$| $$ | $$ | $$| $$$$$$$/|  $$$$$$$|  $$$$$$$  |  $$$$/",
                "|__/|__/ |__/ |__/| $$____/  \\_______/ \\_______/   \\___/  ",
                "                  | $$                                    ",
                "                  | $$                                    ",
                "                  |__/                                    "
            );

            System.out.println(banner);
            System.out.println();
            System.out.println("Hello, my name is Mahir.");
            System.out.println("I'm a second-year Software Engineering student at UVic.");
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
        System.out.println("Run with `banner` to see impact.com in ASCII");
        return 0;
    }
}
