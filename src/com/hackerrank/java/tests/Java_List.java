package com.hackerrank.java.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Java_List {


    static List<Integer> anArray = new ArrayList<>();

    public static void main(String[] args) {

        Scanner in = new Scanner(sample);

        int membersSize = in.nextInt();
        in.nextLine();

        for (int i = 0; i < membersSize; i++) {
            anArray.add(in.nextInt());
        }


        while (in.hasNext()) {
          String s= in.nextLine();

            if (in.hasNext("Insert")) {
                in.nextLine();
                while (in.hasNextInt()) {
                    int index = in.nextInt();
                    int value = in.nextInt();
                    add(index, value);
                }
            } else if (in.hasNext("Delete")) {
                in.nextLine();
                delete(in.nextInt());

            }
        }
        in.close();
        print();

    }


    static void delete(int index) {
        try {
            anArray.remove(index);
        } catch (IndexOutOfBoundsException e){

        }

    }

    static void add(int index, int value) {

       /* if(index > anArray.size()){
            ArrayList<Integer> temp = new ArrayList<Integer>(index +1);
            temp.addAll(anArray);
            for (int i = anArray.size(); i< index; i++){
                temp.add(i, null);
            }

            anArray.addAll(temp);

        }*/
        anArray.add(index, value);
    }

    static void print() {

        anArray.forEach(value -> {
            if(value != null) {
                System.out.print(value + " ");
            }
        });
    }
    static String sample = "50\n" +
            "75192 14885 71431 34461 61231 21558 55622 36011 39791 94414 37813 30293 64822 11691 19285 98683 8562 6953 82718 63941 69534 35738 45068 95556 11046 85063 30936 11640 56380 65304 87804 60980 38266 10904 43475 26649 92856 90700 54044 2437 88357 17442 73368 39722 15320 14133 47254 69024 5565 95080\n" +
            "100\n" +
            "Insert\n" +
            "44 30237\n" +
            "Insert\n" +
            "34 57126\n" +
            "Insert\n" +
            "33 5418\n" +
            "Insert\n" +
            "30 66954\n" +
            "Delete\n" +
            "13\n" +
            "Insert\n" +
            "4 38588\n" +
            "Insert\n" +
            "38 28360\n" +
            "Insert\n" +
            "24 23895\n" +
            "Insert\n" +
            "11 17252\n" +
            "Insert\n" +
            "11 71596\n" +
            "Insert\n" +
            "40 14091\n" +
            "Insert\n" +
            "35 4795\n" +
            "Insert\n" +
            "7 17464\n" +
            "Insert\n" +
            "53 86360\n" +
            "Delete\n" +
            "14\n" +
            "Insert\n" +
            "46 34128\n" +
            "Insert\n" +
            "28 51603\n" +
            "Insert\n" +
            "28 8849\n" +
            "Insert\n" +
            "19 6186\n" +
            "Insert\n" +
            "19 98707\n" +
            "Insert\n" +
            "61 16274\n" +
            "Delete\n" +
            "24\n" +
            "Insert\n" +
            "39 97288\n" +
            "Delete\n" +
            "52\n" +
            "Delete\n" +
            "63\n" +
            "Insert\n" +
            "6 81894\n" +
            "Insert\n" +
            "47 49553\n" +
            "Insert\n" +
            "41 35054\n" +
            "Delete\n" +
            "64\n" +
            "Delete\n" +
            "9\n" +
            "Delete\n" +
            "14\n" +
            "Insert\n" +
            "14 59312\n" +
            "Delete\n" +
            "57\n" +
            "Delete\n" +
            "23\n" +
            "Delete\n" +
            "0\n" +
            "Insert\n" +
            "24 80902\n" +
            "Delete\n" +
            "29\n" +
            "Insert\n" +
            "27 62978\n" +
            "Delete\n" +
            "50\n" +
            "Delete\n" +
            "9\n" +
            "Delete\n" +
            "51\n" +
            "Delete\n" +
            "31\n" +
            "Delete\n" +
            "30\n" +
            "Delete\n" +
            "53\n" +
            "Delete\n" +
            "18\n" +
            "Insert\n" +
            "54 91123\n" +
            "Delete\n" +
            "48\n" +
            "Delete\n" +
            "3\n" +
            "Delete\n" +
            "32\n" +
            "Delete\n" +
            "21\n" +
            "Insert\n" +
            "22 23587\n" +
            "Delete\n" +
            "43\n" +
            "Delete\n" +
            "7\n" +
            "Delete\n" +
            "38\n" +
            "Delete\n" +
            "31\n" +
            "Delete\n" +
            "20\n" +
            "Delete\n" +
            "41\n" +
            "Insert\n" +
            "29 76024\n" +
            "Insert\n" +
            "48 64945\n" +
            "Insert\n" +
            "15 64814\n" +
            "Delete\n" +
            "51\n" +
            "Delete\n" +
            "46\n" +
            "Delete\n" +
            "46\n" +
            "Delete\n" +
            "37\n" +
            "Insert\n" +
            "40 35367\n" +
            "Delete\n" +
            "42\n" +
            "Insert\n" +
            "0 51387\n" +
            "Insert\n" +
            "36 82795\n" +
            "Insert\n" +
            "46 67350\n" +
            "Delete\n" +
            "49\n" +
            "Delete\n" +
            "1\n" +
            "Insert\n" +
            "26 89312\n" +
            "Delete\n" +
            "20\n" +
            "Insert\n" +
            "46 82353\n" +
            "Delete\n" +
            "7\n" +
            "Insert\n" +
            "45 37176\n" +
            "Delete\n" +
            "48\n" +
            "Delete\n" +
            "37\n" +
            "Delete\n" +
            "41\n" +
            "Insert\n" +
            "34 31705\n" +
            "Delete\n" +
            "5\n" +
            "Insert\n" +
            "21 63912\n" +
            "Insert\n" +
            "14 73658\n" +
            "Delete\n" +
            "39\n" +
            "Insert\n" +
            "46 13825\n" +
            "Delete\n" +
            "11\n" +
            "Delete\n" +
            "10\n" +
            "Insert\n" +
            "20 7286\n" +
            "Delete\n" +
            "0\n" +
            "Delete\n" +
            "36\n" +
            "Insert\n" +
            "17 78144\n" +
            "Delete\n" +
            "27\n" +
            "Delete\n" +
            "12\n" +
            "Delete\n" +
            "10\n" +
            "Insert\n" +
            "23 6220\n" +
            "Insert\n" +
            "24 55859\n" +
            "Delete\n" +
            "29\n" +
            "Delete\n" +
            "9\n" +
            "Insert\n" +
            "29 56901\n" +
            "Insert\n" +
            "18 10362\n" +
            "[71431, 34461, 61231, 81894, 17464, 71596, 17252, 59312, 64822, 73658, 6953, 82718, 35738, 23587, 78144, 23895, 62978, 7286, 10362, 63912, 11046, 8849, 89312, 6220, 55859, 85063, 56380, 66954, 76024, 35054, 56901, 60980, 38266, 31705, 82795, 5418, 28360, 35367, 34128, 39722, 67350, 37176, 82353, 13825, 15320, 5565]\n" +
            "\n" +
            ">>> ================================ RESTART ================================\n" +
            ">>>\n" +
            "10\n" +
            "500\n" +
            "29930 2266 77972 59964 29081 28796 18570 35097 2171 12638 66850 24784 34183 45176 37370 3738 34965 98868 13486 73478 67444 67972 64054 55511 24722 34781 6436 14714 3660 23938 52717 6694 17569 57911 22336 5863 98358 37688 1847 96128 80875 12780 43590 86363 88335 16662 66204 41027 83515 92128 74421 62812 33192 22711 15492 26016 19117 88737 11622 53854 79103 40934 74597 37512 62428 53999 16627 37211 35895 84985 89677 5024 29125 10254 67990 51495 73152 68050 70999 14800 29757 17735 45954 69052 59519 14604 97376 71506 52936 57282 46555 52536 88570 66048 59821 63322 6504 74271 81228 52293 380 52382 32945 78850 6131 58686 42270 74378 65807 70473 67487 34779 43821 79340 74140 54943 26138 61368 23572 38502 24153 30457 48849 49130 97029 53559 40151 48865 33374 91092 33336 61792 20582 57617 39726 18490 58013 53396 14693 42225 39317 15352 15778 99621 4616 98999 12096 16470 48044 61627 87833 40201 70147 43512 94240 31823 4062 96629 61004 78430 52624 29688 79415 90277 78111 85054 22727 80901 40573 28776 67842 96599 19554 57115 99185 5929 98411 35743 71996 25138 25107 64652 22768 75128 76466 84198 58112 82277 22097 98468 34317 14457 903 585 77227 83192 3127 92138 14001 84457 59679 83851 17880 63692 42041 44007 47244 38564 35905 32142 4833 82672 23914 79051 97682 34344 37815 1832 47262 43602 62585 19246 54035 76799 35874 8565 70332 84873 59946 15727 51694 26376 93182 86259 86540 30887 74411 25683 99320 44018 83202 17872 6931 17047 45236 62993 88655 73825 59357 18086 27318 9551 55550 71577 27506 59332 75338 53307 72481 60425 78116 55099 13956 68235 13591 32371 26393 47708 87618 83116 7901 14829 45427 3339 74242 70366 51665 25901 49782 60740 36422 23301 52996 42372 5548 16241 24930 12804 46402 78293 98268 31665 56047 14054 84446 91663 22554 97565 2169 33277 84043 58449 17513 60180 23847 61357 20984 40335 18416 46110 72909 96134 7621 15814 18606 32619 69950 96816 40355 14436 96930 40790 28635 34027 13324 20670 87748 34843 59048 21944 37942 92147 48313 51532 10523 16656 40903 95836 7649 93475 50768 94564 37972 17226 99120 27941 98843 69611 31806 29137 60475 58358 41131 96364 34459 61264 76722 69354 59957 43398 16927 48049 17605 84094 16038 39585 88335 94182 22934 75084 54755 1941 75528 62064 5128 42024 69593 29486 43592 18683 98568 20482 58885 53311 54258 9297 28578 96443 59584 67811 4355 17525 4135 16937 53975 81920 96772 40958 20176 19220 21659 74263 97114 7673 39834 16423 94250 36409 81858 21644 88890 85311 66967 44019 96440 45764 5069 38752 15566 32061 44120 72747 33807 52649 89763 38117 57866 80357 62947 437 47154 99162 64041 41197 90934 40323 12853 74906 53490 35434 4365 6468 28719 67411 2490 95078 67168 81598 21901 39663 65375 39319 34460 35343 26403 54544 27131 12383 41014 94982 78268 57791 95942 75573 54060 14063 36960 18617 38068 6784 76091 21197 98066 96438 78819 31857 68561 13890 49323 98255 28986 15771 34170 82771 60173 65659 60465 56905 23662 31589 62325 89976 18677 45133 23568 47245 67814 89827 27130 14785\n" +
            "1000\n" +
            "Insert\n" +
            "15 72750\n" +
            "Insert\n" +
            "441 58\n" +
            "Delete\n" +
            "501\n" +
            "Insert\n" +
            "267 79598\n" +
            "Delete\n" +
            "82\n" +
            "Insert\n" +
            "449 57044\n" +
            "Insert\n" +
            "318 44517\n" +
            "Delete\n" +
            "413\n" +
            "Insert\n" +
            "117 83403\n" +
            "Insert\n" +
            "429 46806\n" +
            "Insert\n" +
            "283 32167\n" +
            "Delete\n" +
            "123\n" +
            "Insert\n" +
            "61 69497\n" +
            "Insert\n" +
            "134 1382\n" +
            "Delete\n" +
            "153\n" +
            "Insert\n" +
            "78 27042\n" +
            "Delete\n" +
            "372\n" +
            "Delete\n" +
            "94\n" +
            "Insert\n" +
            "103 92449\n" +
            "Insert\n" +
            "266 70640\n" +
            "Insert\n" +
            "298 88011\n" +
            "Insert\n" +
            "378 41993\n" +
            "Insert\n" +
            "233 81437\n" +
            "Delete\n" +
            "110\n" +
            "Insert\n" +
            "359 82396\n" +
            "Insert\n" +
            "410 63145\n" +
            "Delete\n" +
            "463\n" +
            "Insert\n" +
            "275 99703\n" +
            "Insert\n" +
            "432 16747\n" +
            "Delete\n" +
            "168\n" +
            "Delete\n" +
            "151\n" +
            "Insert\n" +
            "79 84811\n" +
            "Delete\n" +
            "393\n" +
            "Delete\n" +
            "3\n" +
            "Insert\n" +
            "354 8294\n" +
            "Delete\n" +
            "143\n" +
            "Insert\n" +
            "421 93600\n" +
            "Insert\n" +
            "59 96682\n" +
            "Delete\n" +
            "39\n" +
            "Delete\n" +
            "426\n" +
            "Insert\n" +
            "17 68197\n" +
            "Insert\n" +
            "236 549\n" +
            "Delete\n" +
            "297\n" +
            "Delete\n" +
            "180\n" +
            "Insert\n" +
            "74 21766\n" +
            "Insert\n" +
            "306 63701\n" +
            "Delete\n" +
            "139\n" +
            "Delete\n" +
            "103\n" +
            "Insert\n" +
            "336 8035\n" +
            "Delete\n" +
            "377\n" +
            "Insert\n" +
            "253 79701\n" +
            "Insert\n" +
            "371 7857\n" +
            "Insert\n" +
            "347 6998\n" +
            "Delete\n" +
            "335\n" +
            "Insert\n" +
            "177 14299\n" +
            "Delete\n" +
            "319\n" +
            "Delete\n" +
            "216\n" +
            "Insert\n" +
            "190 41926\n" +
            "Insert\n" +
            "399 66595\n" +
            "Delete\n" +
            "9\n" +
            "Insert\n" +
            "270 38944\n" +
            "Insert\n" +
            "428 54009\n" +
            "Insert\n" +
            "355 51826\n" +
            "Delete\n" +
            "395\n" +
            "Delete\n" +
            "330\n" +
            "Delete\n" +
            "344\n" +
            "Delete\n" +
            "373\n" +
            "Insert\n" +
            "13 27874\n" +
            "Delete\n" +
            "417\n" +
            "Insert\n" +
            "163 45060\n" +
            "Insert\n" +
            "493 15162\n" +
            "Delete\n" +
            "366\n" +
            "Delete\n" +
            "192\n" +
            "Delete\n" +
            "368\n" +
            "Insert\n" +
            "14 95299\n" +
            "Insert\n" +
            "156 77239\n" +
            "Insert\n" +
            "177 19118\n" +
            "Insert\n" +
            "350 77422\n" +
            "Delete\n" +
            "52\n" +
            "Delete\n" +
            "144\n" +
            "Insert\n" +
            "461 46960\n" +
            "Insert\n" +
            "56 21987\n" +
            "Insert\n" +
            "487 70378\n" +
            "Delete\n" +
            "494\n" +
            "Delete\n" +
            "287\n" +
            "Delete\n" +
            "188\n" +
            "Delete\n" +
            "12\n" +
            "Delete\n" +
            "109\n" +
            "Insert\n" +
            "35 89443\n" +
            "Delete\n" +
            "40\n" +
            "Insert\n" +
            "44 81474\n" +
            "Insert\n" +
            "355 87544\n" +
            "Insert\n" +
            "464 77844\n" +
            "Insert\n" +
            "442 2515\n" +
            "Delete\n" +
            "165\n" +
            "Insert\n" +
            "211 87908\n" +
            "Delete\n" +
            "483\n" +
            "Insert\n" +
            "502 75239\n" +
            "Insert\n" +
            "349 49369\n" +
            "Delete\n" +
            "398\n" +
            "Insert\n" +
            "192 73670\n" +
            "Insert\n" +
            "404 36775\n" +
            "Delete\n" +
            "21\n" +
            "Insert\n" +
            "180 23051\n" +
            "Delete\n" +
            "153\n" +
            "Insert\n" +
            "259 31950\n" +
            "Insert\n" +
            "498 48740\n" +
            "Insert\n" +
            "10 95580\n" +
            "Delete\n" +
            "161\n" +
            "Insert\n" +
            "465 8123\n" +
            "Insert\n" +
            "279 49660\n" +
            "Delete\n" +
            "231\n" +
            "Insert\n" +
            "481 7026\n" +
            "Delete\n" +
            "77\n" +
            "Delete\n" +
            "43\n" +
            "Insert\n" +
            "418 23141\n" +
            "Insert\n" +
            "180 86438\n" +
            "Delete\n" +
            "22\n" +
            "Delete\n" +
            "125\n" +
            "Delete\n" +
            "22\n" +
            "Delete\n" +
            "8\n" +
            "Insert\n" +
            "197 14335\n" +
            "Insert\n" +
            "82 21201\n" +
            "Delete\n" +
            "59\n" +
            "Delete\n" +
            "179\n" +
            "Insert\n" +
            "65 21209\n" +
            "Insert\n" +
            "363 15195\n" +
            "Delete\n" +
            "496\n" +
            "Insert\n" +
            "4 44931\n" +
            "Delete\n" +
            "176\n" +
            "Insert\n" +
            "400 6783\n" +
            "Delete\n" +
            "83\n" +
            "Delete\n" +
            "346\n" +
            "Insert\n" +
            "216 14653\n" +
            "Insert\n" +
            "151 54220\n" +
            "Delete\n" +
            "114\n" +
            "Insert\n" +
            "257 32801\n" +
            "Insert\n" +
            "382 69417\n" +
            "Insert\n" +
            "153 39449\n" +
            "Delete\n" +
            "448\n" +
            "Insert\n" +
            "62 53576\n" +
            "Insert\n" +
            "371 47621\n" +
            "Delete\n" +
            "200\n" +
            "Insert\n" +
            "452 53000\n" +
            "Delete\n" +
            "336\n" +
            "Insert\n" +
            "345 27328\n" +
            "Insert\n" +
            "164 61736\n" +
            "Insert\n" +
            "111 84891\n" +
            "Insert\n" +
            "466 12217\n" +
            "Insert\n" +
            "65 45490\n" +
            "Delete\n" +
            "231\n" +
            "Insert\n" +
            "309 68884\n" +
            "Insert\n" +
            "71 13596\n" +
            "Insert\n" +
            "34 93505\n" +
            "Insert\n" +
            "295 8150\n" +
            "Delete\n" +
            "294\n" +
            "Insert\n" +
            "13 40696\n" +
            "Insert\n" +
            "408 19913\n" +
            "Delete\n" +
            "191\n" +
            "Delete\n" +
            "313\n" +
            "Insert\n" +
            "336 60929\n" +
            "Insert\n" +
            "45 96715\n" +
            "Insert\n" +
            "474 80986\n" +
            "Insert\n" +
            "225 7226\n" +
            "Insert\n" +
            "187 63349\n" +
            "Delete\n" +
            "397\n" +
            "Delete\n" +
            "411\n" +
            "Delete\n" +
            "233\n" +
            "Delete\n" +
            "251\n" +
            "Delete\n" +
            "396\n" +
            "Insert\n" +
            "123 22616\n" +
            "Insert\n" +
            "31 85091\n" +
            "Delete\n" +
            "97\n" +
            "Delete\n" +
            "416\n" +
            "Delete\n" +
            "424\n" +
            "Insert\n" +
            "416 37637\n" +
            "Insert\n" +
            "159 80192\n" +
            "Delete\n" +
            "168\n" +
            "Insert\n" +
            "182 56643\n" +
            "Insert\n" +
            "444 4929\n" +
            "Delete\n" +
            "9\n" +
            "Insert\n" +
            "63 92321\n" +
            "Insert\n" +
            "119 72463\n" +
            "Insert\n" +
            "509 80406\n" +
            "Delete\n" +
            "211\n" +
            "Insert\n" +
            "94 38321\n" +
            "Delete\n" +
            "101\n" +
            "Insert\n" +
            "361 94896\n" +
            "Insert\n" +
            "202 43145\n" +
            "Delete\n" +
            "323\n" +
            "Insert\n" +
            "117 36035\n" +
            "Insert\n" +
            "355 90593\n" +
            "Delete\n" +
            "321\n" +
            "Delete\n" +
            "97\n" +
            "Delete\n" +
            "422\n" +
            "Delete\n" +
            "401\n" +
            "Insert\n" +
            "51 63461\n" +
            "Delete\n" +
            "103\n" +
            "Insert\n" +
            "70 25312\n" +
            "Delete\n" +
            "130\n" +
            "Delete\n" +
            "105\n" +
            "Delete\n" +
            "481\n" +
            "Insert\n" +
            "195 38341\n" +
            "Delete\n" +
            "295\n" +
            "Delete\n" +
            "487\n" +
            "Delete\n" +
            "415\n" +
            "Delete\n" +
            "188\n" +
            "Insert\n" +
            "445 39005\n" +
            "Delete\n" +
            "24\n" +
            "Delete\n" +
            "79\n" +
            "Delete\n" +
            "54\n" +
            "Insert\n" +
            "102 56123\n" +
            "Insert\n" +
            "166 20320\n" +
            "Insert\n" +
            "455 45695\n" +
            "Insert\n" +
            "17 6534\n" +
            "Delete\n" +
            "144\n" +
            "Delete\n" +
            "126\n" +
            "Insert\n" +
            "23 87375\n" +
            "Delete\n" +
            "370\n" +
            "Insert\n" +
            "171 71119\n" +
            "Insert\n" +
            "293 4732\n" +
            "Insert\n" +
            "445 90909\n" +
            "Delete\n" +
            "352\n" +
            "Insert\n" +
            "199 48631\n" +
            "Delete\n" +
            "364\n" +
            "Delete\n" +
            "360\n" +
            "Delete\n" +
            "109\n" +
            "Delete\n" +
            "109\n" +
            "Delete\n" +
            "458\n" +
            "Insert\n" +
            "97 15396\n" +
            "Insert\n" +
            "459 95069\n" +
            "Delete\n" +
            "58\n" +
            "Insert\n" +
            "410 20406\n" +
            "Delete\n" +
            "371\n" +
            "Delete\n" +
            "213\n" +
            "Insert\n" +
            "359 51863\n" +
            "Delete\n" +
            "22\n" +
            "Insert\n" +
            "134 76568\n" +
            "Insert\n" +
            "404 65445\n" +
            "Delete\n" +
            "258\n" +
            "Delete\n" +
            "405\n" +
            "Insert\n" +
            "246 18024\n" +
            "Delete\n" +
            "204\n" +
            "Delete\n" +
            "80\n" +
            "Insert\n" +
            "256 84826\n" +
            "Insert\n" +
            "485 47491\n" +
            "Insert\n" +
            "171 88238\n" +
            "Insert\n" +
            "208 99455\n" +
            "Delete\n" +
            "408\n" +
            "Insert\n" +
            "423 84543\n" +
            "Delete\n" +
            "484\n" +
            "Delete\n" +
            "4\n" +
            "Insert\n" +
            "360 50078\n" +
            "Delete\n" +
            "67\n" +
            "Delete\n" +
            "319\n" +
            "Insert\n" +
            "83 18062\n" +
            "Insert\n" +
            "167 63862\n" +
            "Delete\n" +
            "272\n" +
            "Insert\n" +
            "326 47964\n" +
            "Insert\n" +
            "8 13116\n" +
            "Insert\n" +
            "303 20503\n" +
            "Delete\n" +
            "101\n" +
            "Delete\n" +
            "436\n" +
            "Insert\n" +
            "274 93604\n" +
            "Delete\n" +
            "433\n" +
            "Delete\n" +
            "471\n" +
            "Delete\n" +
            "405\n" +
            "Delete\n" +
            "70\n" +
            "Insert\n" +
            "458 2544\n" +
            "Delete\n" +
            "412\n" +
            "Insert\n" +
            "110 72374\n" +
            "Insert\n" +
            "249 30663\n" +
            "Insert\n" +
            "292 15200\n" +
            "Delete\n" +
            "218\n" +
            "Insert\n" +
            "166 77941\n" +
            "Insert\n" +
            "76 62212\n" +
            "Delete\n" +
            "46\n" +
            "Delete\n" +
            "190\n" +
            "Insert\n" +
            "179 80510\n" +
            "Insert\n" +
            "61 3056\n" +
            "Insert\n" +
            "83 73888\n" +
            "Insert\n" +
            "344 62521\n" +
            "Delete\n" +
            "27\n" +
            "Delete\n" +
            "393\n" +
            "Delete\n" +
            "83\n" +
            "Insert\n" +
            "418 3827\n" +
            "Delete\n" +
            "17\n" +
            "Insert\n" +
            "327 89671\n" +
            "Delete\n" +
            "25\n" +
            "Delete\n" +
            "516\n" +
            "Delete\n" +
            "410\n" +
            "Insert\n" +
            "514 91234\n" +
            "Delete\n" +
            "28\n" +
            "Insert\n" +
            "32 24524\n" +
            "Insert\n" +
            "352 58493\n" +
            "Insert\n" +
            "453 18387\n" +
            "Insert\n" +
            "383 88563\n" +
            "Insert\n" +
            "186 80366\n" +
            "Delete\n" +
            "239\n" +
            "Insert\n" +
            "185 14104\n" +
            "Insert\n" +
            "221 96069\n" +
            "Delete\n" +
            "447\n" +
            "Delete\n" +
            "443\n" +
            "Insert\n" +
            "65 76767\n" +
            "Insert\n" +
            "173 51944\n" +
            "Insert\n" +
            "298 18404\n" +
            "Delete\n" +
            "103\n" +
            "Insert\n" +
            "142 1269\n" +
            "Delete\n" +
            "286\n" +
            "Insert\n" +
            "24 29977\n" +
            "Delete\n" +
            "370\n" +
            "Delete\n" +
            "188\n" +
            "Insert\n" +
            "206 87458\n" +
            "Insert\n" +
            "416 28948\n" +
            "Insert\n" +
            "270 43084\n" +
            "Insert\n" +
            "319 53844\n" +
            "Insert\n" +
            "67 95707\n" +
            "Insert\n" +
            "70 98018\n" +
            "Insert\n" +
            "350 94606\n" +
            "Delete\n" +
            "368\n" +
            "Delete\n" +
            "520\n" +
            "Delete\n" +
            "370\n" +
            "Insert\n" +
            "15 92914\n" +
            "Insert\n" +
            "335 43587\n" +
            "Insert\n" +
            "11 59662\n" +
            "Delete\n" +
            "190\n" +
            "Insert\n" +
            "6 26177\n" +
            "Delete\n" +
            "355\n" +
            "Insert\n" +
            "230 18460\n" +
            "Delete\n" +
            "26\n" +
            "Delete\n" +
            "276\n" +
            "Insert\n" +
            "224 72451\n" +
            "Insert\n" +
            "55 67294\n" +
            "Insert\n" +
            "443 40415\n" +
            "Insert\n" +
            "90 45010\n" +
            "Delete\n" +
            "214\n" +
            "Insert\n" +
            "360 15471\n" +
            "Delete\n" +
            "454\n" +
            "Insert\n" +
            "315 8472\n" +
            "Delete\n" +
            "375\n" +
            "Delete\n" +
            "531\n" +
            "Delete\n" +
            "348\n" +
            "Delete\n" +
            "103\n" +
            "Delete\n" +
            "265\n" +
            "Insert\n" +
            "1 67017\n" +
            "Insert\n" +
            "359 12924\n" +
            "Delete\n" +
            "91\n" +
            "Delete\n" +
            "300\n" +
            "Delete\n" +
            "400\n" +
            "Insert\n" +
            "277 7008\n" +
            "Insert\n" +
            "327 33194\n" +
            "Insert\n" +
            "265 8413\n" +
            "Delete\n" +
            "167\n" +
            "Insert\n" +
            "103 48940\n" +
            "Delete\n" +
            "470\n" +
            "Delete\n" +
            "98\n" +
            "Delete\n" +
            "340\n" +
            "Delete\n" +
            "413\n" +
            "Insert\n" +
            "127 76754\n" +
            "Delete\n" +
            "54\n" +
            "Delete\n" +
            "518\n" +
            "Delete\n" +
            "122\n" +
            "Insert\n" +
            "337 91351\n" +
            "Insert\n" +
            "448 70697\n" +
            "Delete\n" +
            "60\n" +
            "Insert\n" +
            "306 7044\n" +
            "Delete\n" +
            "207\n" +
            "Insert\n" +
            "283 97583\n" +
            "Insert\n" +
            "256 71205\n" +
            "Insert\n" +
            "525 27216\n" +
            "Insert\n" +
            "186 11866\n" +
            "Delete\n" +
            "391\n" +
            "Delete\n" +
            "136\n" +
            "Insert\n" +
            "200 58487\n" +
            "Insert\n" +
            "85 17606\n" +
            "Insert\n" +
            "478 67632\n" +
            "Delete\n" +
            "520\n" +
            "Insert\n" +
            "322 95466\n" +
            "Insert\n" +
            "255 49337\n" +
            "Delete\n" +
            "111\n" +
            "Insert\n" +
            "137 80498\n" +
            "Insert\n" +
            "24 4323\n" +
            "Delete\n" +
            "526\n" +
            "Delete\n" +
            "246\n" +
            "Insert\n" +
            "135 1565\n" +
            "Insert\n" +
            "60 3818\n" +
            "Insert\n" +
            "225 21255\n" +
            "Insert\n" +
            "492 19031\n" +
            "Delete\n" +
            "34\n" +
            "Delete\n" +
            "435\n" +
            "Insert\n" +
            "293 5746\n" +
            "Delete\n" +
            "213\n" +
            "Delete\n" +
            "133\n" +
            "Delete\n" +
            "3\n" +
            "Insert\n" +
            "143 30074\n" +
            "Delete\n" +
            "174\n" +
            "Delete\n" +
            "369\n" +
            "Insert\n" +
            "287 41947\n" +
            "Insert\n" +
            "74 89103\n" +
            "Delete\n" +
            "7\n" +
            "Delete\n" +
            "234\n" +
            "Insert\n" +
            "164 61362\n" +
            "Insert\n" +
            "10 70403\n" +
            "Delete\n" +
            "87\n" +
            "Delete\n" +
            "286\n" +
            "Insert\n" +
            "205 83877\n" +
            "Delete\n" +
            "480\n" +
            "Insert\n" +
            "357 36364\n" +
            "Delete\n" +
            "92\n" +
            "Insert\n" +
            "132 77956\n" +
            "Delete\n" +
            "312\n" +
            "Delete\n" +
            "336\n" +
            "Insert\n" +
            "98 95498\n" +
            "Insert\n" +
            "7 63259\n" +
            "Insert\n" +
            "21 66837\n" +
            "Insert\n" +
            "471 7780\n" +
            "Delete\n" +
            "307\n" +
            "Delete\n" +
            "385\n" +
            "Delete\n" +
            "375\n" +
            "Delete\n" +
            "132\n" +
            "Delete\n" +
            "411\n" +
            "Delete\n" +
            "160\n" +
            "Insert\n" +
            "210 44930\n" +
            "Delete\n" +
            "215\n" +
            "Delete\n" +
            "493\n" +
            "Delete\n" +
            "500\n" +
            "Insert\n" +
            "31 77363\n" +
            "Insert\n" +
            "291 72328\n" +
            "Insert\n" +
            "14 41363\n" +
            "Insert\n" +
            "116 79821\n" +
            "Insert\n" +
            "519 77104\n" +
            "Delete\n" +
            "453\n" +
            "Delete\n" +
            "288\n" +
            "Insert\n" +
            "232 56871\n" +
            "Insert\n" +
            "38 31016\n" +
            "Delete\n" +
            "41\n" +
            "Delete\n" +
            "132\n" +
            "Insert\n" +
            "2 32517\n" +
            "Insert\n" +
            "390 66805\n" +
            "Insert\n" +
            "342 43906\n" +
            "Insert\n" +
            "314 9620\n" +
            "Delete\n" +
            "303\n" +
            "Insert\n" +
            "293 42668\n" +
            "Delete\n" +
            "280\n" +
            "Delete\n" +
            "336\n" +
            "Insert\n" +
            "364 98681\n" +
            "Insert\n" +
            "482 93704\n" +
            "Insert\n" +
            "213 58646\n" +
            "Insert\n" +
            "96 65109\n" +
            "Delete\n" +
            "161\n" +
            "Insert\n" +
            "259 470\n" +
            "Insert\n" +
            "434 30589\n" +
            "Delete\n" +
            "129\n" +
            "Insert\n" +
            "5 76155\n" +
            "Delete\n" +
            "280\n" +
            "Delete\n" +
            "246\n" +
            "Insert\n" +
            "522 30641\n" +
            "Insert\n" +
            "160 23121\n" +
            "Insert\n" +
            "281 68053\n" +
            "Delete\n" +
            "393\n" +
            "Insert\n" +
            "406 66083\n" +
            "Insert\n" +
            "317 39590\n" +
            "Delete\n" +
            "345\n" +
            "Insert\n" +
            "132 63081\n" +
            "Insert\n" +
            "243 16983\n" +
            "Insert\n" +
            "128 23344\n" +
            "Insert\n" +
            "1 67327\n" +
            "Delete\n" +
            "457\n" +
            "Delete\n" +
            "460\n" +
            "Delete\n" +
            "128\n" +
            "Insert\n" +
            "507 28580\n" +
            "Delete\n" +
            "523\n" +
            "Delete\n" +
            "28\n" +
            "Insert\n" +
            "261 48344\n" +
            "Insert\n" +
            "484 33640\n" +
            "Delete\n" +
            "55\n" +
            "Delete\n" +
            "195\n" +
            "Delete\n" +
            "182\n" +
            "Delete\n" +
            "18\n" +
            "Insert\n" +
            "457 18512\n" +
            "Delete\n" +
            "182\n" +
            "Insert\n" +
            "59 15117\n" +
            "Delete\n" +
            "5\n" +
            "Insert\n" +
            "485 98122\n" +
            "Delete\n" +
            "195\n" +
            "Delete\n" +
            "369\n" +
            "Insert\n" +
            "382 37103\n" +
            "Delete\n" +
            "312\n" +
            "Insert\n" +
            "140 83804\n" +
            "Insert\n" +
            "405 2787\n" +
            "Delete\n" +
            "464\n" +
            "Insert\n" +
            "57 55474\n" +
            "Insert\n" +
            "440 11249\n" +
            "Insert\n" +
            "154 79454\n" +
            "Insert\n" +
            "69 59196\n" +
            "Insert\n" +
            "148 75597\n" +
            "Insert\n" +
            "319 96410\n" +
            "Delete\n" +
            "254\n" +
            "Insert\n" +
            "6 67950\n" +
            "Insert\n" +
            "338 71725\n" +
            "Delete\n" +
            "529\n" +
            "Insert\n" +
            "352 39410\n" +
            "Delete\n" +
            "439\n" +
            "Delete\n" +
            "74\n" +
            "Delete\n" +
            "299\n" +
            "Insert\n" +
            "227 94056\n" +
            "Delete\n" +
            "100\n" +
            "Insert\n" +
            "391 69933\n" +
            "Insert\n" +
            "530 59642\n" +
            "Insert\n" +
            "460 30595\n" +
            "Insert\n" +
            "418 7466\n" +
            "Delete\n" +
            "148\n" +
            "Delete\n" +
            "16\n" +
            "Insert\n" +
            "362 11630\n" +
            "Insert\n" +
            "40 60844\n" +
            "Insert\n" +
            "160 7072\n" +
            "Insert\n" +
            "471 97578\n" +
            "Insert\n" +
            "274 97619\n" +
            "Delete\n" +
            "364\n" +
            "Insert\n" +
            "129 60067\n" +
            "Delete\n" +
            "296\n" +
            "Delete\n" +
            "243\n" +
            "Insert\n" +
            "23 65470\n" +
            "Insert\n" +
            "102 40767\n" +
            "Delete\n" +
            "196\n" +
            "Delete\n" +
            "342\n" +
            "Delete\n" +
            "34\n" +
            "Delete\n" +
            "254\n" +
            "Delete\n" +
            "482\n" +
            "Delete\n" +
            "272\n" +
            "Delete\n" +
            "289\n" +
            "Insert\n" +
            "130 70116\n" +
            "Insert\n" +
            "124 97867\n" +
            "Delete\n" +
            "384\n" +
            "Insert\n" +
            "137 41793\n" +
            "Insert\n" +
            "32 80324\n" +
            "Delete\n" +
            "368\n" +
            "Delete\n" +
            "112\n" +
            "Insert\n" +
            "187 69319\n" +
            "Insert\n" +
            "45 64054\n" +
            "Insert\n" +
            "160 66262\n" +
            "Insert\n" +
            "10 1630\n" +
            "Delete\n" +
            "224\n" +
            "Insert\n" +
            "194 14516\n" +
            "Insert\n" +
            "408 21109\n" +
            "Insert\n" +
            "62 14554\n" +
            "Insert\n" +
            "436 89077\n" +
            "Insert\n" +
            "91 34895\n" +
            "Delete\n" +
            "10\n" +
            "Insert\n" +
            "340 32852\n" +
            "Insert\n" +
            "181 20723\n" +
            "Insert\n" +
            "544 70211\n" +
            "Delete\n" +
            "264\n" +
            "Delete\n" +
            "312\n" +
            "Insert\n" +
            "132 628\n" +
            "Insert\n" +
            "439 39259\n" +
            "Delete\n" +
            "364\n" +
            "Insert\n" +
            "348 62244\n" +
            "Insert\n" +
            "346 91282\n" +
            "Insert\n" +
            "108 10929\n" +
            "Delete\n" +
            "534\n" +
            "Delete\n" +
            "415\n" +
            "Delete\n" +
            "441\n" +
            "Delete\n" +
            "387\n" +
            "Insert\n" +
            "400 13997\n" +
            "Insert\n" +
            "531 96143\n" +
            "Insert\n" +
            "2 91603\n" +
            "Insert\n" +
            "371 91042\n" +
            "Insert\n" +
            "225 18360\n" +
            "Insert\n" +
            "123 59202\n" +
            "Delete\n" +
            "189\n" +
            "Insert\n" +
            "486 71462\n" +
            "Delete\n" +
            "445\n" +
            "Delete\n" +
            "525\n" +
            "Delete\n" +
            "182\n" +
            "Insert\n" +
            "162 80767\n" +
            "Insert\n" +
            "330 92706\n" +
            "Delete\n" +
            "88\n" +
            "Delete\n" +
            "180\n" +
            "Delete\n" +
            "71\n" +
            "Insert\n" +
            "475 11860\n" +
            "Delete\n" +
            "277\n" +
            "Insert\n" +
            "223 42524\n" +
            "Delete\n" +
            "229\n" +
            "Insert\n" +
            "142 84471\n" +
            "Delete\n" +
            "182\n" +
            "Delete\n" +
            "376\n" +
            "Delete\n" +
            "136\n" +
            "Insert\n" +
            "314 23666\n" +
            "Insert\n" +
            "133 20583\n" +
            "Delete\n" +
            "79\n" +
            "Insert\n" +
            "294 16335\n" +
            "Insert\n" +
            "490 68621\n" +
            "Delete\n" +
            "61\n" +
            "Insert\n" +
            "377 58118\n" +
            "Delete\n" +
            "330\n" +
            "Insert\n" +
            "350 10320\n" +
            "Insert\n" +
            "70 5681\n" +
            "Insert\n" +
            "519 52738\n" +
            "Insert\n" +
            "113 76694\n" +
            "Insert\n" +
            "178 3046\n" +
            "Insert\n" +
            "136 37194\n" +
            "Insert\n" +
            "471 65439\n" +
            "Insert\n" +
            "520 94108\n" +
            "Insert\n" +
            "473 44392\n" +
            "Insert\n" +
            "172 54306\n" +
            "Insert\n" +
            "481 26400\n" +
            "Insert\n" +
            "133 35429\n" +
            "Delete\n" +
            "150\n" +
            "Insert\n" +
            "152 39325\n" +
            "Insert\n" +
            "270 8488\n" +
            "Delete\n" +
            "50\n" +
            "Insert\n" +
            "366 4250\n" +
            "Delete\n" +
            "425\n" +
            "Delete\n" +
            "474\n" +
            "Insert\n" +
            "155 29272\n" +
            "Insert\n" +
            "275 90854\n" +
            "Delete\n" +
            "95\n" +
            "Insert\n" +
            "373 97532\n" +
            "Insert\n" +
            "403 41065\n" +
            "Insert\n" +
            "561 49447\n" +
            "Delete\n" +
            "8\n" +
            "Insert\n" +
            "135 98593\n" +
            "Delete\n" +
            "420\n" +
            "Insert\n" +
            "469 77237\n" +
            "Insert\n" +
            "183 57052\n" +
            "Delete\n" +
            "126\n" +
            "Insert\n" +
            "48 33959\n" +
            "Insert\n" +
            "227 47508\n" +
            "Delete\n" +
            "312\n" +
            "Insert\n" +
            "156 12857\n" +
            "Delete\n" +
            "416\n" +
            "Delete\n" +
            "289\n" +
            "Insert\n" +
            "0 73813\n" +
            "Insert\n" +
            "408 55103\n" +
            "Delete\n" +
            "106\n" +
            "Insert\n" +
            "40 3228\n" +
            "Delete\n" +
            "512\n" +
            "Delete\n" +
            "335\n" +
            "Insert\n" +
            "512 51315\n" +
            "Insert\n" +
            "364 11875\n" +
            "Delete\n" +
            "549\n" +
            "Insert\n" +
            "269 60592\n" +
            "Insert\n" +
            "216 96151\n" +
            "Insert\n" +
            "444 94217\n" +
            "Delete\n" +
            "341\n" +
            "Delete\n" +
            "129\n" +
            "Delete\n" +
            "418\n" +
            "Delete\n" +
            "552\n" +
            "Insert\n" +
            "472 91326\n" +
            "Delete\n" +
            "122\n" +
            "Delete\n" +
            "168\n" +
            "Insert\n" +
            "212 63236\n" +
            "Insert\n" +
            "437 83225\n" +
            "Delete\n" +
            "503\n" +
            "Delete\n" +
            "279\n" +
            "Insert\n" +
            "59 57320\n" +
            "Delete\n" +
            "41\n" +
            "Delete\n" +
            "288\n" +
            "Delete\n" +
            "116\n" +
            "Insert\n" +
            "346 58471\n" +
            "Delete\n" +
            "370\n" +
            "Insert\n" +
            "182 47644\n" +
            "Delete\n" +
            "380\n" +
            "Insert\n" +
            "313 64809\n" +
            "Delete\n" +
            "415\n" +
            "Delete\n" +
            "207\n" +
            "Delete\n" +
            "223\n" +
            "Delete\n" +
            "380\n" +
            "Delete\n" +
            "449\n" +
            "Insert\n" +
            "411 72178\n" +
            "Insert\n" +
            "270 47821\n" +
            "Insert\n" +
            "512 49252\n" +
            "Delete\n" +
            "452\n" +
            "Delete\n" +
            "375\n" +
            "Insert\n" +
            "434 32727\n" +
            "Delete\n" +
            "452\n" +
            "Delete\n" +
            "351\n" +
            "Insert\n" +
            "193 38268\n" +
            "Insert\n" +
            "308 93627\n" +
            "Insert\n" +
            "69 49436\n" +
            "Insert\n" +
            "389 93123\n" +
            "Delete\n" +
            "254\n" +
            "Delete\n" +
            "177\n" +
            "Insert\n" +
            "349 10614\n" +
            "Insert\n" +
            "268 67452\n" +
            "Insert\n" +
            "135 55526\n" +
            "Insert\n" +
            "513 81987\n" +
            "Delete\n" +
            "378\n" +
            "Insert\n" +
            "71 33380\n" +
            "Delete\n" +
            "160\n" +
            "Insert\n" +
            "133 57216\n" +
            "Insert\n" +
            "155 3595\n" +
            "Delete\n" +
            "511\n" +
            "Delete\n" +
            "242\n" +
            "Delete\n" +
            "152\n" +
            "Insert\n" +
            "483 99280\n" +
            "Delete\n" +
            "37\n" +
            "Delete\n" +
            "537\n" +
            "Insert\n" +
            "126 31053\n" +
            "Insert\n" +
            "495 70451\n" +
            "Delete\n" +
            "125\n" +
            "Insert\n" +
            "153 98318\n" +
            "Insert\n" +
            "132 86517\n" +
            "Delete\n" +
            "515\n" +
            "Insert\n" +
            "156 37937\n" +
            "Insert\n" +
            "372 48699\n" +
            "Delete\n" +
            "402\n" +
            "Delete\n" +
            "265\n" +
            "Insert\n" +
            "19 21746\n" +
            "Insert\n" +
            "316 98013\n" +
            "Delete\n" +
            "251\n" +
            "Delete\n" +
            "63\n" +
            "Delete\n" +
            "85\n" +
            "Insert\n" +
            "299 89788\n" +
            "Delete\n" +
            "424\n" +
            "Insert\n" +
            "186 67188\n" +
            "Insert\n" +
            "547 33669\n" +
            "Delete\n" +
            "141\n" +
            "Insert\n" +
            "245 75076\n" +
            "Insert\n" +
            "160 18059\n" +
            "Insert\n" +
            "478 83501\n" +
            "Delete\n" +
            "375\n" +
            "Delete\n" +
            "476\n" +
            "Delete\n" +
            "380\n" +
            "Insert\n" +
            "407 46214\n" +
            "Insert\n" +
            "189 91935\n" +
            "Insert\n" +
            "26 49806\n" +
            "Delete\n" +
            "454\n" +
            "Insert\n" +
            "438 49097\n" +
            "Insert\n" +
            "490 1153\n" +
            "Insert\n" +
            "466 61415\n" +
            "Delete\n" +
            "198\n" +
            "Delete\n" +
            "392\n" +
            "Delete\n" +
            "561\n" +
            "Delete\n" +
            "151\n" +
            "Insert\n" +
            "421 86504\n" +
            "Insert\n" +
            "127 55902\n" +
            "Delete\n" +
            "382\n" +
            "Delete\n" +
            "266\n" +
            "Insert\n" +
            "304 44667\n" +
            "Delete\n" +
            "25\n" +
            "Delete\n" +
            "386\n" +
            "Delete\n" +
            "106\n" +
            "Delete\n" +
            "110\n" +
            "Delete\n" +
            "422\n" +
            "Delete\n" +
            "354\n" +
            "Delete\n" +
            "343\n" +
            "Delete\n" +
            "310\n" +
            "Delete\n" +
            "70\n" +
            "Insert\n" +
            "351 20762\n" +
            "Delete\n" +
            "118\n" +
            "Delete\n" +
            "110\n" +
            "Insert\n" +
            "505 96950\n" +
            "Delete\n" +
            "103\n" +
            "Delete\n" +
            "323\n" +
            "Delete\n" +
            "227\n" +
            "Insert\n" +
            "414 15673\n" +
            "Delete\n" +
            "386\n" +
            "Insert\n" +
            "74 50329\n" +
            "Delete\n" +
            "297\n" +
            "Insert\n" +
            "448 60621\n" +
            "Insert\n" +
            "233 34319\n" +
            "Insert\n" +
            "135 12282\n" +
            "Delete\n" +
            "489\n" +
            "Delete\n" +
            "230\n" +
            "Insert\n" +
            "133 78856\n" +
            "Delete\n" +
            "343\n" +
            "Insert\n" +
            "234 80089\n" +
            "Insert\n" +
            "196 40362\n" +
            "Delete\n" +
            "413\n" +
            "Delete\n" +
            "496\n" +
            "Delete\n" +
            "491\n" +
            "Insert\n" +
            "61 27954\n" +
            "Insert\n" +
            "337 17738\n" +
            "Delete\n" +
            "420\n" +
            "Delete\n" +
            "238\n" +
            "Delete\n" +
            "457\n" +
            "Delete\n" +
            "449\n" +
            "Insert\n" +
            "382 5458\n" +
            "Insert\n" +
            "540 49908\n" +
            "Insert\n" +
            "535 98437\n" +
            "Delete\n" +
            "431\n" +
            "Insert\n" +
            "4 90384\n" +
            "Delete\n" +
            "445\n" +
            "Insert\n" +
            "222 53797\n" +
            "Insert\n" +
            "487 38710\n" +
            "Insert\n" +
            "234 38627\n" +
            "Insert\n" +
            "19 62255\n" +
            "Delete\n" +
            "52\n" +
            "Insert\n" +
            "316 17848\n" +
            "Insert\n" +
            "153 32027\n" +
            "Delete\n" +
            "409\n" +
            "Delete\n" +
            "543\n" +
            "Insert\n" +
            "242 43514\n" +
            "Insert\n" +
            "422 62428\n" +
            "Delete\n" +
            "129\n" +
            "Delete\n" +
            "214\n" +
            "Delete\n" +
            "552\n" +
            "Delete\n" +
            "453\n" +
            "Delete\n" +
            "393\n" +
            "Delete\n" +
            "59\n" +
            "Insert\n" +
            "526 89435\n" +
            "Delete\n" +
            "546\n" +
            "Insert\n" +
            "545 10878\n" +
            "Insert\n" +
            "141 83652\n" +
            "Delete\n" +
            "136\n" +
            "Delete\n" +
            "206\n" +
            "Insert\n" +
            "222 93913\n" +
            "Delete\n" +
            "210\n" +
            "Delete\n" +
            "276\n" +
            "Insert\n" +
            "88 92458\n" +
            "Insert\n" +
            "216 17408\n" +
            "Insert\n" +
            "470 82797\n" +
            "Delete\n" +
            "292\n" +
            "Insert\n" +
            "495 7697\n" +
            "Insert\n" +
            "202 6824\n" +
            "Delete\n" +
            "73\n" +
            "Insert\n" +
            "165 29493\n" +
            "Insert\n" +
            "115 77782\n" +
            "Insert\n" +
            "74 35111\n" +
            "Delete\n" +
            "158\n" +
            "Insert\n" +
            "351 99490\n" +
            "Delete\n" +
            "546\n" +
            "Insert\n" +
            "484 62902\n" +
            "Delete\n" +
            "387\n" +
            "Insert\n" +
            "104 74699\n" +
            "Delete\n" +
            "57\n" +
            "Insert\n" +
            "288 99806\n" +
            "Insert\n" +
            "30 39643\n" +
            "Insert\n" +
            "279 79348\n" +
            "Delete\n" +
            "518\n" +
            "Insert\n" +
            "95 25114\n" +
            "Insert\n" +
            "19 16760\n" +
            "Delete\n" +
            "399\n" +
            "Insert\n" +
            "279 3411\n" +
            "Delete\n" +
            "241\n" +
            "Insert\n" +
            "86 95665\n" +
            "Insert\n" +
            "363 55742\n" +
            "Delete\n" +
            "398\n" +
            "Insert\n" +
            "126 97652\n" +
            "Delete\n" +
            "549\n" +
            "Delete\n" +
            "4\n" +
            "Delete\n" +
            "182\n" +
            "Delete\n" +
            "491\n" +
            "Insert\n" +
            "378 78290\n" +
            "Insert\n" +
            "252 99002\n" +
            "Delete\n" +
            "266\n" +
            "Delete\n" +
            "224\n" +
            "Delete\n" +
            "308\n" +
            "Delete\n" +
            "388\n" +
            "Delete\n" +
            "400\n" +
            "Insert\n" +
            "76 55508\n" +
            "Insert\n" +
            "256 48605\n" +
            "Insert\n" +
            "296 90617\n" +
            "Delete\n" +
            "302\n" +
            "Delete\n" +
            "490\n" +
            "Delete\n" +
            "58\n" +
            "Insert\n" +
            "239 26333\n" +
            "Insert\n" +
            "225 36732\n" +
            "Insert\n" +
            "506 1227\n" +
            "Delete\n" +
            "230\n" +
            "Insert\n" +
            "201 1532\n" +
            "Insert\n" +
            "224 43736\n" +
            "Insert\n" +
            "56 53708\n" +
            "Insert\n" +
            "160 65342\n" +
            "Delete\n" +
            "90\n" +
            "Insert\n" +
            "9 67488\n" +
            "Delete\n" +
            "118\n" +
            "Delete\n" +
            "388\n" +
            "Delete\n" +
            "448\n" +
            "Insert\n" +
            "140 50121\n" +
            "Insert\n" +
            "258 68814\n" +
            "Insert\n" +
            "252 96408\n" +
            "Delete\n" +
            "231\n" +
            "Insert\n" +
            "48 28324\n" +
            "Insert\n" +
            "175 60390\n" +
            "Delete\n" +
            "107\n" +
            "Delete\n" +
            "369\n" +
            "Insert\n" +
            "44 88383\n" +
            "Insert\n" +
            "137 13395\n" +
            "Insert\n" +
            "276 67572\n" +
            "Insert\n" +
            "38 31399\n" +
            "Insert\n" +
            "267 78831\n" +
            "Insert\n" +
            "64 92194\n" +
            "Delete\n" +
            "501\n" +
            "Delete\n" +
            "37\n" +
            "Insert\n" +
            "556 59817\n" +
            "Insert\n" +
            "333 28832\n" +
            "Insert\n" +
            "392 91743\n" +
            "Delete\n" +
            "401\n" +
            "Insert\n" +
            "159 81747\n" +
            "Insert\n" +
            "388 44902\n" +
            "Delete\n" +
            "251\n" +
            "Delete\n" +
            "557\n" +
            "Insert\n" +
            "185 56607\n" +
            "Insert\n" +
            "392 38521\n" +
            "Insert\n" +
            "537 62745\n" +
            "Delete\n" +
            "415\n" +
            "Delete\n" +
            "520\n" +
            "Insert\n" +
            "187 77523\n" +
            "Delete\n" +
            "553\n" +
            "Insert\n" +
            "259 32441\n" +
            "Delete\n" +
            "368\n" +
            "Delete\n" +
            "171\n" +
            "Insert\n" +
            "288 83781\n" +
            "Insert\n" +
            "517 11357\n" +
            "Insert\n" +
            "147 61635\n" +
            "Delete\n" +
            "171\n" +
            "Insert\n" +
            "21 4484\n" +
            "Delete\n" +
            "432\n" +
            "Delete\n" +
            "257\n" +
            "Insert\n" +
            "21 1229\n" +
            "Delete\n" +
            "137\n" +
            "Insert\n" +
            "294 69545\n" +
            "Delete\n" +
            "171\n" +
            "Delete\n" +
            "558\n" +
            "Delete\n" +
            "456\n" +
            "Delete\n" +
            "438\n" +
            "Insert\n" +
            "180 71193\n" +
            "Delete\n" +
            "249\n" +
            "Delete\n" +
            "66\n" +
            "Delete\n" +
            "335\n" +
            "Insert\n" +
            "114 5904\n" +
            "Delete\n" +
            "6\n" +
            "Insert\n" +
            "521 99097\n" +
            "Delete\n" +
            "348\n" +
            "Delete\n" +
            "19\n" +
            "Insert\n" +
            "503 65558\n" +
            "Insert\n" +
            "497 25166\n" +
            "Delete\n" +
            "415\n" +
            "Insert\n" +
            "527 19591\n" +
            "Insert\n" +
            "482 61152\n" +
            "Delete\n" +
            "241\n" +
            "Delete\n" +
            "508\n" +
            "Insert\n" +
            "208 88829\n" +
            "Insert\n" +
            "225 19080\n" +
            "Insert\n" +
            "71 61162\n" +
            "Delete\n" +
            "135\n" +
            "Insert\n" +
            "405 87617\n" +
            "Delete\n" +
            "182\n" +
            "Delete\n" +
            "388\n" +
            "Insert\n" +
            "273 95941\n" +
            "Insert\n" +
            "113 61514\n" +
            "Delete\n" +
            "23\n" +
            "Delete\n" +
            "469\n" +
            "Delete\n" +
            "394\n" +
            "Delete\n" +
            "62\n" +
            "Insert\n" +
            "527 69563\n" +
            "Insert\n" +
            "273 87274\n" +
            "Delete\n" +
            "24\n" +
            "Insert\n" +
            "454 85503\n" +
            "Delete\n" +
            "315\n" +
            "Insert\n" +
            "273 72639\n" +
            "Insert\n" +
            "53 84198\n" +
            "Delete\n" +
            "21\n" +
            "Delete\n" +
            "425\n" +
            "Insert\n" +
            "390 68794\n" +
            "Delete\n" +
            "364\n" +
            "Insert\n" +
            "338 56363\n" +
            "Delete\n" +
            "460\n" +
            "Insert\n" +
            "18 68799\n" +
            "Delete\n" +
            "391\n" +
            "Insert\n" +
            "487 33325\n" +
            "Delete\n" +
            "378\n" +
            "Insert\n" +
            "191 41557\n" +
            "Insert\n" +
            "523 35522\n" +
            "Insert\n" +
            "515 85914\n" +
            "Insert\n" +
            "199 95210\n" +
            "Insert\n" +
            "226 2009\n" +
            "Delete\n" +
            "175\n" +
            "Delete\n" +
            "470\n" +
            "Insert\n" +
            "166 6748\n" +
            "Insert\n" +
            "73 7537\n" +
            "Delete\n" +
            "183\n" +
            "Delete\n" +
            "146\n" +
            "Delete\n" +
            "403\n" +
            "Insert\n" +
            "59 30299\n" +
            "Delete\n" +
            "143\n" +
            "Delete\n" +
            "29\n" +
            "Insert\n" +
            "181 16492\n" +
            "Delete\n" +
            "55\n" +
            "Insert\n" +
            "296 54338\n" +
            "Delete\n" +
            "141\n" +
            "Delete\n" +
            "328\n" +
            "Delete\n" +
            "296\n" +
            "Insert\n" +
            "47 37114\n" +
            "Insert\n" +
            "288 91266\n" +
            "Insert\n" +
            "258 70832\n" +
            "Insert\n" +
            "331 84313\n" +
            "Insert\n" +
            "184 75878\n" +
            "Insert\n" +
            "545 230\n" +
            "Delete\n" +
            "336\n" +
            "Delete\n" +
            "412\n" +
            "Insert\n" +
            "498 89079\n" +
            "Delete\n" +
            "487\n" +
            "Insert\n" +
            "446 95385\n" +
            "Insert\n" +
            "421 91358\n" +
            "Delete\n" +
            "456\n" +
            "Insert\n" +
            "239 82322";
}
