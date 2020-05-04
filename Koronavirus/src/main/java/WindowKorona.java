import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowKorona extends JFrame {
    public WindowKorona() {
        setTitle("Coronavirus statistics");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 100, 900, 600);
        JButton[] jbc = new JButton[85];
        setLayout(new FlowLayout());
        jbc[0] = new JButton("Москва");
        jbc[1] = new JButton("Московская область");
        jbc[2] = new JButton("Санкт-Петербург");
        jbc[3] = new JButton("Нижегородская обл.");
        jbc[4] = new JButton("Республика Дагестан");
        jbc[5] = new JButton("Мурманская область");
        jbc[6] = new JButton("Краснодарский край");
        jbc[7] = new JButton("Тульская обл.");
        jbc[8] = new JButton("Ростовская обл.");
        jbc[9] = new JButton("Брянская обл.");
        jbc[10] = new JButton("Калужская обл.");
        jbc[11] = new JButton("Свердловская обл.");
        jbc[12] = new JButton("Рязанская обл.");
        jbc[13] = new JButton("Ленинградская обл.");
        jbc[14] = new JButton("Республика Татарстан");
        jbc[15] = new JButton("Республика Башкортостан");
        jbc[16] = new JButton("Республика Северная Осетия - Алания");
        jbc[17] = new JButton("Курская обл.");
        jbc[18] = new JButton("Республика Ингушетия");
        jbc[19] = new JButton("Владимирская обл.");
        jbc[20] = new JButton("Республика Мордовия");
        jbc[21] = new JButton("Тамбовская обл.");
        jbc[22] = new JButton("Красноярский край");
        jbc[23] = new JButton("Республика Чувашия");
        jbc[24] = new JButton("Ставропольский край");
        jbc[25] = new JButton("Ярославская обл.");
        jbc[26] = new JButton("Республика Коми");
        jbc[27] = new JButton("Республика Марий Эл");
        jbc[28] = new JButton("Орловская обл.");
        jbc[29] = new JButton("Тверская обл.");
        jbc[30] = new JButton("Кабардино - Балкарская Республика");
        jbc[31] = new JButton("Челябинская обл.");
        jbc[32] = new JButton("Хабаровский край");
        jbc[33] = new JButton("Новосибирская обл.");
        jbc[34] = new JButton("Оренбургская обл.");
        jbc[35] = new JButton("Ямало-Немецкий автономный округ");
        jbc[36] = new JButton("Воронежская обл.");
        jbc[37] = new JButton("Пермский край");
        jbc[38] = new JButton("Кировская обл.");
        jbc[39] = new JButton("Саратовская обл.");
        jbc[40] = new JButton("Чеченская Республика");
        jbc[41] = new JButton("Липецкая обл.");
        jbc[42] = new JButton("Самарская обл.");
        jbc[43] = new JButton("Пензенская обл.");
        jbc[44] = new JButton("Смоленская обл.");
        jbc[45] = new JButton("Ульяновская обл.");
        jbc[46] = new JButton("Алтайский край");
        jbc[47] = new JButton("Тюменская обл.");
        jbc[48] = new JButton("Приморский край");
        jbc[49] = new JButton("Астраханская обл.");
        jbc[50] = new JButton("Калининградская обл.");
        jbc[51] = new JButton("Волгоградская обл.");
        jbc[52] = new JButton("Ивановская обл.");
        jbc[53] = new JButton("Белгородская обл.");
        jbc[54] = new JButton("Ханты-Мансийский АО");
        jbc[55] = new JButton("Карачаево-Черкесская Республика");
        jbc[56] = new JButton("Республика Бурятия");
        jbc[57] = new JButton("Новгородская обл.");
        jbc[58] = new JButton("Камчатский край");
        jbc[59] = new JButton("Республика Калмыкия");
        jbc[60] = new JButton("Республика Саха (Якутия)");
        jbc[61] = new JButton("Республика Хакасия");
        jbc[62] = new JButton("Удмуртская Республика");
        jbc[63] = new JButton("Архангельская обл.");
        jbc[64] = new JButton("Костромская обл.");
        jbc[65] = new JButton("Вологодская обл.");
        jbc[66] = new JButton("Псковская обл.");
        jbc[67] = new JButton("Республика Адыгия");
        jbc[68] = new JButton("Забайкальский край");
        jbc[69] = new JButton("Кемеровская обл.");
        jbc[70] = new JButton("Иркутская обл.");
        jbc[71] = new JButton("Еврейская автономная обл.");
        jbc[72] = new JButton("Омская обл.");
        jbc[73] = new JButton("Томская обл.");
        jbc[74] = new JButton("Магаданская обл.");
        jbc[75] = new JButton("Республика Крым");
        jbc[76] = new JButton("Севастополь");
        jbc[77] = new JButton("Республика Карелия");
        jbc[78] = new JButton("Амурская обл.");
        jbc[79] = new JButton("Курганская обл.");
        jbc[80] = new JButton("Немецкий автономный округ");
        jbc[81] = new JButton("Республика Тыва");
        jbc[82] = new JButton("Республика Алтай");
        jbc[83] = new JButton("Сахалинская обл.");
        jbc[84] = new JButton("Чукотская автономный округ");

        for (int i = 0; i < jbc.length; i++) {
            add(jbc[i]);
        }

        jbc[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(0);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(1);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(2);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(3);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(4);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(5);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[6].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(6);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[7].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(7);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[8].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(8);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[9].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(9);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[10].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(10);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[11].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(11);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[12].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(12);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[13].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(13);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[14].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(14);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[15].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(15);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[16].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(16);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[17].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(17);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[18].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(18);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[19].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(19);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[20].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(20);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[21].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(21);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[22].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(22);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[23].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(23);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[24].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(24);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[25].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(25);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[26].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(26);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[27].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(27);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[28].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(28);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[29].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(29);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[30].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(30);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[31].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(31);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[32].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(32);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[33].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(33);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[34].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(34);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[35].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(35);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[36].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(36);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[37].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(37);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[38].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(38);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[39].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(39);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[40].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(40);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[41].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(41);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[42].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(42);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[43].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(43);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[44].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(44);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[45].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(45);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[46].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(46);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[47].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(47);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[48].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(48);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[49].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(49);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[50].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(50);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[51].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(51);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[52].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(52);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[53].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(53);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[54].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(54);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[55].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(55);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[56].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(56);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[57].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(57);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[58].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(58);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[59].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(59);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[60].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(60);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[61].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(61);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[62].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(62);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[63].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(63);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[64].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(64);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[65].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(65);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[66].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(66);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[67].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(67);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[68].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(68);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[69].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(69);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[70].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(70);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[71].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(71);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[72].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(72);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[73].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(73);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[74].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(74);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[75].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(75);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[76].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(76);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[77].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(77);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[78].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(78);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[79].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(79);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[80].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(80);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[81].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(81);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[82].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(82);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[83].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(83);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });

        jbc[84].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indent();
                try {
                    Parser.click(84);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });



        setVisible(true);
    }

    public static void indent() {
        for (int i = 0; i < 10; ++i) System.out.println();
    }
}