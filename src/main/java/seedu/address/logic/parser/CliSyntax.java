package seedu.address.logic.parser;

/**
 * Contains Command Line Interface (CLI) syntax definitions common to multiple commands
 */
public class CliSyntax {

    /* Prefix definitions */
    public static final Prefix PREFIX_AMOUNT = new Prefix("a/");
    public static final Prefix PREFIX_DATE = new Prefix("t/");
    public static final Prefix PREFIX_DESCRIPTION = new Prefix("d/");
    public static final Prefix PREFIX_EXPENSE_CATEGORY = new Prefix("c/");
    public static final Prefix PREFIX_FILTER_DATE = new Prefix("ft/");
    public static final Prefix PREFIX_PERSON_NAME = new Prefix("n/");
}
