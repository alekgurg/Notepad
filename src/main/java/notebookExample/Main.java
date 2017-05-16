package notebookExample;

import asg.cliche.ShellFactory;

import java.io.IOException;

/**
 * Created by alekgurg on 09.05.2017.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        Notebook commands = new Notebook();

        asg.cliche.Shell shell;
        shell = ShellFactory.createConsoleShell(
                "cmd",
                "My Notebook",
//                "say",
                commands
        );
        shell.commandLoop();
    }
}
