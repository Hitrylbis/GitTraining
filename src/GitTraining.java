import java.util.Scanner;
// меняет Programmist2
public class GitTraining {
    protected static void startText (){
        System.out.println( "Введите последовательно команды соответсвенно с их описанием\n"
                + "команда №1 - подключает для текушей дериктории версионный контроль\n"
                + "команда №2 - проверяет, в какой стадии нахоятся файлы в текущем локальном репозитории\n"
                + "команда №3 - подготавливает все файлы к коммиту\n"
                + "команда №4 - сохраняет в версионный контроль готовые к коммиту файлы(введите саму команду без доп. сообщений)\n"
                + "команда №5 - Загружает все изменения из локальной ветки в удалённый репозиторий\n"
                + "команда №6 - создаёт новую ветку из той, в которой вы сейчас находитесь.(введите только саму команду без названия ветки)\n"
                + "команда №7 - переключает с одной ветки на другую (введите только саму команду без названия ветки)\n"
                + "команда №8 - позволяет переименовать ветку (введите только саму команду без указания имени ветки)\n"
                + "команда №9 - удаляет указанную ветку при нахождении вне этой ветки в момент удаления введите только саму команду без указания имени ветки)\n"
                + "Введите команду №1");
    }
    //Programmist2 stop
    //Далее меняет Programmist1
    protected static void training (){
        String [] command = new String[9];
        command [0] = "git init";
        command [1] = "git status";
        command [2] = "git add .";
        command [3] = "git commit -m";
        command [4] = "git push";
        command [5] = "git checkout -b";
        command [6] = "git checkout";
        command [7] = "git branch -m";
        command [8] = "git branch -d";
        Scanner Scan = new Scanner(System.in);
        String printCommand = Scan.nextLine();
        int i = 0;
        for (i=0;(i+1) < command.length;i++){
            if (command [i].equals(printCommand)){
                System.out.println("Верно! теперь ведите команду №"+ (i+2));
                String printCommand1 = Scan.nextLine();
                printCommand = printCommand1;
            } else {
                i -= 1;
                System.out.println("Комманда введена неерно ведите заново команду №" + (i+2));
                String printCommand2 = Scan.nextLine();
                printCommand = printCommand2;
            }
        }
        System.out.println("Ура! тест наконец то закончен Вы молодец");
    }



}
