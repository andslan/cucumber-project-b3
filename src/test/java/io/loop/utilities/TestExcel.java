package io.loop.utilities;

public class TestExcel {

    public static void main(String[] args) {

        ExcelUtils excelUtils = new ExcelUtils("src/test/resources/Sample.xlsx", "Nadir");
        System.out.println("excelUtils.getCellData(1,1) = " + excelUtils.getCellData(1, 1));

        excelUtils.setCellData("Nadir", "C", 1);

//        excelUtils.setCellData("Feyruz", 1, 1);
    }


}
