package homeWeek1;

//- сложение двух чисел
//- вычитание двух чисел
//- умножение двух чисел
//- деление двух чисел

public class Calculator {

    public int execute(String operation) {

        operation.trim();

        //преобразуем операцию вычетания
        operation = operation.replaceAll("-", "+-");

        //убираем первый плюс
        if (operation.charAt(0) == '+') {
            operation = operation.substring(1);
        }

        //разбиваем на слагаемые
        String[] adds = operation.split("\\+");

        //складываем слагаемые
        int result = 0;
        for (int i = 0; i < adds.length; i++) {

            result += addOperand(adds[i].trim());

        }

        return result;

    }

    private static int addOperand(String operation) {

        int indexOp = operation.indexOf("*");
        int indexDiv = operation.indexOf("/");

        int result = 0;
        if (indexOp == -1 && indexDiv == -1) {

            //только одна цифра
            result = Integer.parseInt(operation);

        }
        else if (indexDiv == -1 || (indexOp != -1 && indexOp < indexDiv)){

            //только операции умножения или операция умножения первая
            result = Integer.parseInt(operation.substring(0, indexOp).trim()) * addOperand(operation.substring(indexOp + 1).trim());

        }
        else {//indexOp == -1 || indexDiv < indexOp

            //только операции деления или операция деления первая
            result = Integer.parseInt(operation.substring(0, indexDiv).trim()) / addOperand(operation.substring(indexDiv + 1).trim());

        }

        return result;

    }



}
//        else if (indexOp == -1){
//
//            //только операции деления
//            result = Integer.parseInt(operation.substring(0, indexDiv).trim()) / findName(operation.substring(indexDiv + 1).trim());
//
//        }
//        else if (indexOp < indexDiv){
//
//            //операция умножения раньше
//            result = Integer.parseInt(operation.substring(0, indexOp).trim()) * findName(operation.substring(indexOp + 1).trim());
//
//        }
//
//        while(indexOp != -1 || indexDiv != -1){
//
//            if
//        }