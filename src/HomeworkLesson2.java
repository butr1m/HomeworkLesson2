public class HomeworkLesson2 {
        public static void main(String[] args) {

            int yearOfBirthday=1994;
            int monthOfBirthday=11;
            int dayOfBirthday=23;
            int sum;
            sum=yearOfBirthday+monthOfBirthday+dayOfBirthday;
            System.out.println("Сумма моего года, месяца и дня рождения равна:"+sum);

            boolean monthBiggerDay=monthOfBirthday>dayOfBirthday;
            System.out.println("Месяц поего рождения больше даты моего рождения:"+monthBiggerDay);

            char[] name={'А','л','е','к','с','а','н','д','р'};
            //System.out.println(name);
            for(int i=0; i<name.length;i++){
                int n;
                n=name[i];
                System.out.print(n+" ");
                n++;
            }

            System.out.println();
            double myAge=26;
            double partYear=316.0/12.0;
            System.out.println("Мне "+partYear+" лет");
        }
    }

