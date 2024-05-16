package com.design.infra.constant;


import java.math.BigDecimal;


@SuppressWarnings("all")
public class CommonConstants {

    private CommonConstants() {}

    public static final String COMMA_EN = ",";
    public static final String COMMA_ZH = "，";
    public static final String SEMICOLON_EN = ";";
    public static final String SEMICOLON_ZH = "；";
    public static final String POUND = "#";
    public static final String COLON_EN = ":";
    public static final String DBL_COLON_EN = "::";
    public static final String COLON_ZH = "：";
    public static final String TILDE_EN = "~";
    public static final String TILDE_ZH = "～";
    public static final String SLASH = "/";
    public static final String HYPHEN = "-";
    public static final String UNDER_LINE = "_";
    public static final String VERTICAL_LINE = "|";
    public static final String VERTICAL_LINE_REGEX = "\\|";
    public static final String DOT = ".";
    public static final String DOT_REGEX = "\\.";
    public static final String EMPTY = "";
    public static final String SPACE = " ";
    public static final String PERCENT = "%";
    public static final String PLUS = "+";
    public static final String MINUS = "-";
    public static final String EQUAL = "=";
    public static final String TAG_START = "[[";
    public static final String TAG_END = "]]";
    public static final String AND = "&";
    public static final String OR = "|";
    public static final String NOT = "!";
    public static final String DBL_AND = "&&";
    public static final String DBL_OR = "||";
    public static final String QUESTION_MARK_EN = "?";
    public static final String QUESTION_MARK_ZH = "？";
    public static final String DESENSITIZATION = "*******";
    public static final String MOCK = "mock";
    public static final String EOL = System.lineSeparator();
    public static final String DBL_EOL = System.lineSeparator() + System.lineSeparator();
    public static final String NULL = "null";
    public static final String TRUE = "true";
    public static final String FALSE = "false";
    public static final String VERSION = "1.0";
    public static final String CHARSET = "UTF-8";
    public static final String FORMAT = "JSON";
    public static final String DEFAULT_ZONE_ID = "Asia/Shanghai";
    public static final String MINUS_ONE = "-1";
    public static final String ZERO = "0";
    public static final String ONE = "1";
    public static final String TWO = "2";
    public static final String THREE = "3";
    public static final String FOUR = "4";
    public static final String FIVE = "5";
    public static final String SIX = "6";
    public static final String SEVEN = "7";
    public static final String EIGHT = "8";
    public static final String NINE = "9";
    public static final String TEN = "10";
    public static final int MINUS_ONE_INT = -1;
    public static final int ZERO_INT = 0;
    public static final int ONE_INT = 1;
    public static final int TWO_INT = 2;
    public static final int THREE_INT = 3;
    public static final int FOUR_INT = 4;
    public static final int FIVE_INT = 5;
    public static final int SIX_INT = 6;
    public static final int SEVEN_INT = 7;
    public static final int EIGHT_INT = 8;
    public static final int NINE_INT = 9;
    public static final int TEN_INT = 10;
    public static final long MINUS_ONE_LONG = -1L;
    public static final long ZERO_LONG = 0L;
    public static final long ONE_LONG = 1L;
    public static final long TWO_LONG = 2L;
    public static final long THREE_LONG = 3L;
    public static final long FOUR_LONG = 4L;
    public static final long FIVE_LONG = 5L;
    public static final long SIX_LONG = 6L;
    public static final long SEVEN_LONG = 7L;
    public static final long EIGHT_LONG = 8L;
    public static final long NINE_LONG = 9L;
    public static final long TEN_LONG = 10L;
    public static final double MINUS_ONE_DOUBLE = -1D;
    public static final double ZERO_DOUBLE = 0D;
    public static final double ONE_DOUBLE = 1D;
    public static final double TWO_DOUBLE = 2D;
    public static final double THREE_DOUBLE = 3D;
    public static final double FOUR_DOUBLE = 4D;
    public static final double FIVE_DOUBLE = 5D;
    public static final double SIX_DOUBLE = 6D;
    public static final double SEVEN_DOUBLE = 7D;
    public static final double EIGHT_DOUBLE = 8D;
    public static final double NINE_DOUBLE = 9D;
    public static final double TEN_DOUBLE = 10D;

    public static final int SEC_OF_ONE_SEC = 1;
    public static final int SEC_OF_TWO_SEC = 2;
    public static final int SEC_OF_THREE_SEC = 3;
    public static final int SEC_OF_FOUR_SEC = 4;
    public static final int SEC_OF_FIVE_SEC = 5;
    public static final int SEC_OF_SIX_SEC = 6;
    public static final int SEC_OF_SEVEN_SEC = 7;
    public static final int SEC_OF_EIGHT_SEC = 8;
    public static final int SEC_OF_NINE_SEC = 9;
    public static final int SEC_OF_TEN_SEC = 10;
    public static final int SEC_OF_FIFTEEN_SEC = 15;
    public static final int SEC_OF_TWENTY_SEC = 20;
    public static final int SEC_OF_TWENTY_FIVE_SEC = 25;
    public static final int SEC_OF_THIRTY_SEC = 30;
    public static final int SEC_OF_THIRTY_FIVE_SEC = 35;
    public static final int SEC_OF_FORTY_SEC = 40;
    public static final int SEC_OF_FORTY_FIVE_SEC = 45;
    public static final int SEC_OF_FIFTY_SEC = 50;
    public static final int SEC_OF_FIFTY_FIVE_SEC = 55;
    public static final int SEC_OF_SIXTY_SEC = 60;
    public static final int SEC_OF_SIXTY_FIVE_SEC = 65;
    public static final int SEC_OF_SEVENTY_SEC = 70;
    public static final int SEC_OF_SEVENTY_FIVE_SEC = 75;
    public static final int SEC_OF_EIGHTY_SEC = 80;
    public static final int SEC_OF_EIGHTY_FIVE_SEC = 85;
    public static final int SEC_OF_NINTY_SEC = 90;
    public static final int SEC_OF_NINTY_FIVE_SEC = 95;
    public static final int SEC_OF_ONE_HUNDRED_SEC = 100;
    public static final int SEC_OF_ONE_HUNDRED_AND_FIVE_SEC = 105;
    public static final int SEC_OF_ONE_HUNDRED_AND_TEN_SEC = 110;
    public static final int SEC_OF_ONE_HUNDRED_AND_FIFTEEN_SEC = 115;
    public static final int SEC_OF_ONE_HUNDRED_AND_TWENTY_SEC = 120;

    public static final int SEC_OF_ONE_MIN = 1 * 60 * SEC_OF_ONE_SEC;
    public static final int SEC_OF_TWO_MIN = 2 * 60 * SEC_OF_ONE_SEC;
    public static final int SEC_OF_THREE_MIN = 3 * 60 * SEC_OF_ONE_SEC;
    public static final int SEC_OF_FOUR_MIN = 4 * 60 * SEC_OF_ONE_SEC;
    public static final int SEC_OF_FIVE_MIN = 5 * 60 * SEC_OF_ONE_SEC;
    public static final int SEC_OF_SIX_MIN = 6 * 60 * SEC_OF_ONE_SEC;
    public static final int SEC_OF_SEVEN_MIN = 7 * 60 * SEC_OF_ONE_SEC;
    public static final int SEC_OF_EIGHT_MIN = 8 * 60 * SEC_OF_ONE_SEC;
    public static final int SEC_OF_NINE_MIN = 9 * 60 * SEC_OF_ONE_SEC;
    public static final int SEC_OF_TEN_MIN = 10 * 60 * SEC_OF_ONE_SEC;
    public static final int SEC_OF_FIFTEEN_MIN = 15 * 60 * SEC_OF_ONE_SEC;
    public static final int SEC_OF_TWENTY_MIN = 20 * 60 * SEC_OF_ONE_SEC;
    public static final int SEC_OF_TWENTY_FIVE_MIN = 25 * 60 * SEC_OF_ONE_SEC;
    public static final int SEC_OF_THIRTY_MIN = 30 * 60 * SEC_OF_ONE_SEC;
    public static final int SEC_OF_THIRTY_FIVE_MIN = 35 * 60 * SEC_OF_ONE_SEC;
    public static final int SEC_OF_FORTY_MIN = 40 * 60 * SEC_OF_ONE_SEC;
    public static final int SEC_OF_FORTY_FIVE_MIN = 45 * 60 * SEC_OF_ONE_SEC;
    public static final int SEC_OF_FIFTY_MIN = 50 * 60 * SEC_OF_ONE_SEC;
    public static final int SEC_OF_FIFTY_FIVE_MIN = 55 * 60 * SEC_OF_ONE_SEC;
    public static final int SEC_OF_SIXTY_MIN = 60 * 60 * SEC_OF_ONE_SEC;
    public static final int SEC_OF_SIXTY_FIVE_MIN = 65 * 60 * SEC_OF_ONE_SEC;
    public static final int SEC_OF_SEVENTY_MIN = 70 * 60 * SEC_OF_ONE_SEC;
    public static final int SEC_OF_SEVENTY_FIVE_MIN = 75 * 60 * SEC_OF_ONE_SEC;
    public static final int SEC_OF_EIGHTY_MIN = 80 * 60 * SEC_OF_ONE_SEC;
    public static final int SEC_OF_EIGHTY_FIVE_MIN = 85 * 60 * SEC_OF_ONE_SEC;
    public static final int SEC_OF_NINTY_MIN = 90 * 60 * SEC_OF_ONE_SEC;
    public static final int SEC_OF_NINTY_FIVE_MIN = 95 * 60 * SEC_OF_ONE_SEC;
    public static final int SEC_OF_ONE_HUNDRED_MIN = 100 * 60 * SEC_OF_ONE_SEC;
    public static final int SEC_OF_ONE_HUNDRED_AND_FIVE_MIN = 105 * 60 * SEC_OF_ONE_SEC;
    public static final int SEC_OF_ONE_HUNDRED_AND_TEN_MIN = 110 * 60 * SEC_OF_ONE_SEC;
    public static final int SEC_OF_ONE_HUNDRED_AND_FIFTEEN_MIN = 115 * 60 * SEC_OF_ONE_SEC;
    public static final int SEC_OF_ONE_HUNDRED_AND_TWENTY_MIN = 120 * 60 * SEC_OF_ONE_SEC;


    public static final int SEC_OF_HALF_HOUR = 30 * SEC_OF_ONE_MIN;
    public static final int SEC_OF_ONE_HOUR = 1 * 60 * SEC_OF_ONE_MIN;
    public static final int SEC_OF_TWO_HOUR = 2 * 60 * SEC_OF_ONE_MIN;
    public static final int SEC_OF_THREE_HOUR = 3 * 60 * SEC_OF_ONE_MIN;
    public static final int SEC_OF_FOUR_HOUR = 4 * 60 * SEC_OF_ONE_MIN;
    public static final int SEC_OF_FIVE_HOUR = 5 * 60 * SEC_OF_ONE_MIN;
    public static final int SEC_OF_SIX_HOUR = 6 * 60 * SEC_OF_ONE_MIN;
    public static final int SEC_OF_SEVEN_HOUR = 7 * 60 * SEC_OF_ONE_MIN;
    public static final int SEC_OF_EIGHT_HOUR = 8 * 60 * SEC_OF_ONE_MIN;
    public static final int SEC_OF_NINE_HOUR = 9 * 60 * SEC_OF_ONE_MIN;
    public static final int SEC_OF_TEN_HOUR = 10 * 60 * SEC_OF_ONE_MIN;
    public static final int SEC_OF_ELEVEN_HOUR = 11 * 60 * SEC_OF_ONE_MIN;
    public static final int SEC_OF_TWELVE_HOUR = 12 * 60 * SEC_OF_ONE_MIN;

    public static final int SEC_OF_HALF_DAY = 12 * SEC_OF_ONE_HOUR;
    public static final int SEC_OF_ONE_DAY = 1* 24 * SEC_OF_ONE_HOUR;
    public static final int SEC_OF_TWO_DAY = 2 * 24 * SEC_OF_ONE_HOUR;
    public static final int SEC_OF_THREE_DAY = 3 * 24 * SEC_OF_ONE_HOUR;
    public static final int SEC_OF_FOUR_DAY = 4 * 24 * SEC_OF_ONE_HOUR;
    public static final int SEC_OF_FIVE_DAY = 5 * 24 * SEC_OF_ONE_HOUR;
    public static final int SEC_OF_SIX_DAY = 6 * 24 * SEC_OF_ONE_HOUR;
    public static final int SEC_OF_SEVEN_DAY = 7 * 24 * SEC_OF_ONE_HOUR;
    public static final int SEC_OF_EIGHT_DAY = 8 * 24 * SEC_OF_ONE_HOUR;
    public static final int SEC_OF_NINE_DAY = 9 * 24 * SEC_OF_ONE_HOUR;
    public static final int SEC_OF_TEN_DAY = 10 * 24 * SEC_OF_ONE_HOUR;

    public static final int SEC_OF_ONE_WEEK = 1 * 7 * SEC_OF_ONE_DAY;
    public static final int SEC_OF_TWO_WEEK = 2 * 7 * SEC_OF_ONE_DAY;
    public static final int SEC_OF_THREE_WEEK = 3 * 7 * SEC_OF_ONE_DAY;
    public static final int SEC_OF_FOUR_WEEK = 4 * 7 * SEC_OF_ONE_DAY;
    public static final int SEC_OF_FIVE_WEEK = 5 * 7 * SEC_OF_ONE_DAY;
    public static final int SEC_OF_SIX_WEEK = 6 * 7 * SEC_OF_ONE_DAY;
    public static final int SEC_OF_SEVEN_WEEK = 7 * 7 * SEC_OF_ONE_DAY;
    public static final int SEC_OF_EIGHT_WEEK = 8 * 7 * SEC_OF_ONE_DAY;
    public static final int SEC_OF_NINE_WEEK = 9 * 7 * SEC_OF_ONE_DAY;
    public static final int SEC_OF_TEN_WEEK = 10 * 7 * SEC_OF_ONE_DAY;

    public static final int SEC_OF_HALF_MONTH = 15 * SEC_OF_TEN_DAY;
    public static final int SEC_OF_ONE_MONTH = 1 * 30 * SEC_OF_TEN_DAY;
    public static final int SEC_OF_TWO_MONTH = 2 * 30 * SEC_OF_TEN_DAY;
    public static final int SEC_OF_THREE_MONTH = 3 * 30 * SEC_OF_TEN_DAY;
    public static final int SEC_OF_FOUR_MONTH = 4 * 30 * SEC_OF_TEN_DAY;
    public static final int SEC_OF_FIVE_MONTH = 5 * 30 * SEC_OF_TEN_DAY;
    public static final int SEC_OF_SIX_MONTH = 6 * 30 * SEC_OF_TEN_DAY;
    public static final int SEC_OF_SEVEN_MONTH = 7 * 30 * SEC_OF_TEN_DAY;
    public static final int SEC_OF_EIGHT_MONTH = 8 * 30 * SEC_OF_TEN_DAY;
    public static final int SEC_OF_NINE_MONTH = 9 * 30 * SEC_OF_TEN_DAY;
    public static final int SEC_OF_TEN_MONTH = 10 * 30 * SEC_OF_TEN_DAY;
    public static final int SEC_OF_ELEVEN_MONTH = 11 * 30 * SEC_OF_TEN_DAY;
    public static final int SEC_OF_TWELVE_MONTH = 12 * 30 * SEC_OF_TEN_DAY;

    public static final int SEC_OF_HALF_YEAR = 6 * SEC_OF_ONE_MONTH;
    public static final int SEC_OF_ONE_YEAR = 1 * 12 * SEC_OF_ONE_MONTH;
    public static final int SEC_OF_TWO_YEAR = 2 * 12 * SEC_OF_ONE_MONTH;
    public static final int SEC_OF_THREE_YEAR = 3 * 12 * SEC_OF_ONE_MONTH;
    public static final int SEC_OF_FOUR_YEAR = 4 * 12 * SEC_OF_ONE_MONTH;
    public static final int SEC_OF_FIVE_YEAR = 5 * 12 * SEC_OF_ONE_MONTH;
    public static final int SEC_OF_SIX_YEAR = 6 * 12 * SEC_OF_ONE_MONTH;
    public static final int SEC_OF_SEVEN_YEAR = 7 * 12 * SEC_OF_ONE_MONTH;
    public static final int SEC_OF_EIGHT_YEAR = 8 * 12 * SEC_OF_ONE_MONTH;
    public static final int SEC_OF_NINE_YEAR = 9 * 12 * SEC_OF_ONE_MONTH;
    public static final int SEC_OF_TEN_YEAR = 10 * 12 * SEC_OF_ONE_MONTH;

    public static final int MILLI_OF_ONE_MILLI = 1;
    public static final int MILLI_OF_HALF_SEC = 500 *  MILLI_OF_ONE_MILLI;
    public static final int MILLI_OF_ONE_SEC = 1 * 1000 *  MILLI_OF_ONE_MILLI;
    public static final int MILLI_OF_TWO_SEC = 2 * 1000 *  MILLI_OF_ONE_MILLI;
    public static final int MILLI_OF_THREE_SEC = 3 * 1000 *  MILLI_OF_ONE_MILLI;
    public static final int MILLI_OF_FOUR_SEC = 4 * 1000 *  MILLI_OF_ONE_MILLI;
    public static final int MILLI_OF_FIVE_SEC = 5 * 1000 *  MILLI_OF_ONE_MILLI;
    public static final int MILLI_OF_SIX_SEC = 6 * 1000 *  MILLI_OF_ONE_MILLI;
    public static final int MILLI_OF_SEVEN_SEC = 7 * 1000 *  MILLI_OF_ONE_MILLI;
    public static final int MILLI_OF_EIGHT_SEC = 8 * 1000 *  MILLI_OF_ONE_MILLI;
    public static final int MILLI_OF_NINE_SEC = 9 * 1000 *  MILLI_OF_ONE_MILLI;
    public static final int MILLI_OF_TEN_SEC = 10 * 1000 *  MILLI_OF_ONE_MILLI;
    public static final int MILLI_OF_FIFTEEN_SEC = 15 * 1000 *  MILLI_OF_ONE_MILLI;
    public static final int MILLI_OF_TWENTY_SEC = 20 * 1000 *  MILLI_OF_ONE_MILLI;
    public static final int MILLI_OF_TWENTY_FIVE_SEC = 25 * 1000 *  MILLI_OF_ONE_MILLI;
    public static final int MILLI_OF_THIRTY_SEC = 30 * 1000 *  MILLI_OF_ONE_MILLI;
    public static final int MILLI_OF_THIRTY_FIVE_SEC = 35 * 1000 *  MILLI_OF_ONE_MILLI;
    public static final int MILLI_OF_FORTY_SEC = 40 * 1000 *  MILLI_OF_ONE_MILLI;
    public static final int MILLI_OF_FORTY_FIVE_SEC = 45 * 1000 *  MILLI_OF_ONE_MILLI;
    public static final int MILLI_OF_FIFTY_SEC = 50 * 1000 *  MILLI_OF_ONE_MILLI;
    public static final int MILLI_OF_FIFTY_FIVE_SEC = 55 * 1000 *  MILLI_OF_ONE_MILLI;
    public static final int MILLI_OF_SIXTY_SEC = 60 * 1000 *  MILLI_OF_ONE_MILLI;

    public static final int MILLI_OF_HALF_MIN = 30 * MILLI_OF_ONE_SEC;
    public static final int MILLI_OF_ONE_MIN = 1 * 60 * MILLI_OF_ONE_SEC;
    public static final int MILLI_OF_TWO_MIN = 2 * 60 * MILLI_OF_ONE_SEC;
    public static final int MILLI_OF_THREE_MIN = 3 * 60 * MILLI_OF_ONE_SEC;
    public static final int MILLI_OF_FOUR_MIN = 4 * 60 * MILLI_OF_ONE_SEC;
    public static final int MILLI_OF_FIVE_MIN = 5 * 60 * MILLI_OF_ONE_SEC;
    public static final int MILLI_OF_SIX_MIN = 6 * 60 * MILLI_OF_ONE_SEC;
    public static final int MILLI_OF_SEVEN_MIN = 7 * 60 * MILLI_OF_ONE_SEC;
    public static final int MILLI_OF_EIGHT_MIN = 8 * 60 * MILLI_OF_ONE_SEC;
    public static final int MILLI_OF_NINE_MIN = 9 * 60 * MILLI_OF_ONE_SEC;
    public static final int MILLI_OF_TEN_MIN = 10 * 60 * MILLI_OF_ONE_SEC;
    public static final int MILLI_OF_FIFTEEN_MIN = 15 * 60 * MILLI_OF_ONE_SEC;
    public static final int MILLI_OF_TWENTY_MIN = 20 * 60 * MILLI_OF_ONE_SEC;
    public static final int MILLI_OF_TWENTY_FIVE_MIN = 25 * 60 * MILLI_OF_ONE_SEC;
    public static final int MILLI_OF_THIRTY_MIN = 30 * 60 * MILLI_OF_ONE_SEC;
    public static final int MILLI_OF_THIRTY_FIVE_MIN = 35 * 60 * MILLI_OF_ONE_SEC;
    public static final int MILLI_OF_FORTY_MIN = 40 * 60 * MILLI_OF_ONE_SEC;
    public static final int MILLI_OF_FORTY_FIVE_MIN = 45 * 60 * MILLI_OF_ONE_SEC;
    public static final int MILLI_OF_FIFTY_MIN = 50 * 60 * MILLI_OF_ONE_SEC;
    public static final int MILLI_OF_FIFTY_FIVE_MIN = 55 * 60 * MILLI_OF_ONE_SEC;
    public static final int MILLI_OF_SIXTY_MIN = 60 * 60 * MILLI_OF_ONE_SEC;

    public static final int MILLI_OF_ONE_HOUR = 1 * 60 * MILLI_OF_ONE_MIN;
    public static final int MILLI_OF_TWO_HOUR = 2 * 60 * MILLI_OF_ONE_MIN;
    public static final int MILLI_OF_THREE_HOUR = 3 * 60 * MILLI_OF_ONE_MIN;
    public static final int MILLI_OF_FOUR_HOUR = 4 * 60 * MILLI_OF_ONE_MIN;
    public static final int MILLI_OF_FIVE_HOUR = 5 * 60 * MILLI_OF_ONE_MIN;
    public static final int MILLI_OF_SIX_HOUR = 6 * 60 * MILLI_OF_ONE_MIN;
    public static final int MILLI_OF_SEVEN_HOUR = 7 * 60 * MILLI_OF_ONE_MIN;
    public static final int MILLI_OF_EIGHT_HOUR = 8 * 60 * MILLI_OF_ONE_MIN;
    public static final int MILLI_OF_NINE_HOUR = 9 * 60 * MILLI_OF_ONE_MIN;
    public static final int MILLI_OF_TEN_HOUR = 10 * 60 * MILLI_OF_ONE_MIN;

}
