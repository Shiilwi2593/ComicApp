package edu.huflit.comicsapp;

import android.app.Application;


public class Data extends Application {
    ComicsDB comicsDB;
    @Override
    public void onCreate() {
        super.onCreate();
        comicsDB = new ComicsDB(this);
        comicsDB.createTable();
        if (comicsDB.countComics() == 0) {

            comicsDB.insertComics("Jigokuraku",
                    "https://i.pinimg.com/564x/e8/0e/d5/e80ed5ca0ca260dec4e07d75e2954721.jpg",
                    "Hành Động",
                    0,
                    "Jigokuraku.pdf",
                    "Gabimaru Vô Hồn, vốn là một ninja sát thủ, bị nhiều người khiếp sợ như một " +
                            "kẻ máu lạnh. Mặc dù đã bị kết án tử hình nhưng không có ai đủ khả năng để" +
                            " giết chết cậu ta. Sau đó, nữ đao phủ nhà Asaemon đến gặp Gabimaru và thắp" +
                            " lên chút hi vọng mong manh cho cậu ta với lời đề nghị vô cùng bất ngờ, rằng" +
                            " nếu muốn gặp lại người vợ thân thương của mình, Gabimaru sẽ phải bắt đầu một " +
                            "cuộc hành trình dưới sự giám sát của Mạc Phủ, tới một hòn đảo bí ẩn để tìm thứ " +
                            "thuốc trường sinh bất lão bất tử. Chỉ cần tìm thấy thứ đó, Gabimaru, hoặc những tên" +
                            " phạm nhân khát máu khác, sẽ được miễn hết tội danh và có thể bắt đầu lại một cuộc sống" +
                            " mới. Từ đó, một cuộc phiêu lưu siêu kịch tính đã bắt đầu!",
                    "Yuji Kaku");

            comicsDB.insertComics("Blue Box",
                    "https://i.pinimg.com/564x/e3/bc/85/e3bc854b8768b29d26ba0208b60cae2b.jpg",
                    "Tình Cảm",
                    0,
                    "BlueBox.pdf",
                    "Taiki Inomata, năm ba sơ trung, là thành viên của đội cầu lông. Kể từ khi tập luyện cùng với đội cầu lông, cậu luôn cố đến sớm nhất có thể, thế nhưng, cậu chỉ là người thứ hai đến nhà đa năng. Bởi vì người đầu tiên luôn đến sớm nhất, chính là Chinatsu Kano, năm nhất cao trung, và là người mà cậu thích.\n" +
                            "\n" +
                            "Vì sự chênh lệch giữa mức độ nổi tiếng mà cậu cảm thấy mình không thể kéo gần khoảng cách với cô ấy. Thế nhưng...\n" +
                            "\n" +
                            "Vào một ngày đẹp trời, vì chuyện gia đình, Chinatsu Kano đã đến sống chung với Taiki Inomata.\n" +
                            "\n" +
                            "Với cơ hội ngàn năm có một này, với cái flag romcom to hơn núi Phú Sĩ này, liệu rằng cậu chàng Taiki có thể làm nên chuyện hay không?",
                    "Kouji Miura");

            comicsDB.insertComics("Jujusu Kaisen",
                    "https://i.pinimg.com/564x/d7/7a/ee/d77aee2dbd96c0cee9e02d7549ed44de.jpg",
                    "Hành Động",
                    0,
                    "JujustuKaisen.pdf",
                    "Yuuji Itadori là một thiên tài có tốc độ và sức mạnh, nhưng cậu ấy muốn dành" +
                            " thời gian của mình trong Câu lạc bộ Tâm Linh. Một ngày sau cái chết của ông" +
                            " mình, anh gặp Megumi Fushiguro, người đang tìm kiếm vật thể bị nguyền rủa mà" +
                            " các thành viên CLB đã tìm thấy.\n" +
                            " \n" +
                            "Đối mặt với những con quái vật khủng khiếp bị \"Ám\", Yuuji nuốt vật thể bị phong" +
                            " ấn để có được sức mạnh của nó và cứu bạn bè của mình! Nhưng giờ Yuuji là người bị" +
                            " \"Ám\", và cậu ấy sẽ bị kéo vào thế giới ma quỷ ly kỳ của Megumi và những con quái vật độc ác ...",
                    "Gege Akutami");

            comicsDB.insertComics("Dragon Ball",
                    "https://i.pinimg.com/564x/1e/8f/2b/1e8f2bbe8fa2aaad300dcfce9a75efdc.jpg",
                    "Hành Động",
                    0,
                    "DragonBall.pdf",
                    "Câu truyện kể về một cậu bé tên Songoku cùng nhóm bạn của mình tham gia những" +
                            " chuyến phiêu lưu tìm ngọc rồng, chống lại cái ác bảo vệ trái đất. Nhân vật" +
                            " Songoku được mọi người ưa thích bởi tính thánh thiện và ngây ngô của mình. Câu" +
                            " truyện lôi cuốn người qua những tình huống phiêu lưu kì thú, những pha đấu võ đẹp" +
                            " mắt, và những tình huống hài hước.",
                    "Akira Toriyama");

            comicsDB.insertComics("Slam Dunk!",
                    "https://i.pinimg.com/564x/9c/20/70/9c20709abcf589c7a7db8f1612464529.jpg", "Thể Thao",
                    0,
                    "slamdunk.pdf",
                    "Slam Dunk là bộ manga thể thao dài 31 tập" +
                            " được sáng tác bởi tác giả Inoue Takehiko nói về đội bóng " +
                            "rổ của trường cao trung Shōhoku. Slam Dunk ra mắt độc giả" +
                            " lần đầu tiên trên tạp chí truyện tranh phát hành hàng tuần" +
                            " Shonen Jump ở Nhật Bản và đã bán được hơn 100 triệu bản trên" +
                            " đất nước này. TVM Comics đã mua bản quyền xuất bản tại Việt Nam," +
                            " với tên bản quyền hiện tại là tên gốc. Bộ truyện Slam Dunk nhanh" +
                            " chóng gặt hát được nhiều thành công tại Nhật Bản. Ngay sau khi nó" +
                            " được xuất bản, thanh thiếu niên Nhật bắt đầu chơi bóng rổ và bóng " +
                            "rổ ngày càng trở nên phổ biến. Tác giả Inoue còn sử dụng đề tài bóng " +
                            "rổ cho 2 bộ manga khác: Buzzer Beater và Real.",
                    "Takehiko Inoue");

            comicsDB.insertComics("Mob Psycho 100",
                    "https://i.pinimg.com/564x/bf/d9/89/bfd9894e1d659852adbecc5225e56e07.jpg",
                    "Hài Hước",
                    0,
                    "MobPsycho100.pdf",

                    "Một tác phẩm khác của ONE (tác giả bản gốc của One Punch Man) Truyện thuộc" +
                            " thể loại tâm lý, nét vẽ xấu nhưng nội dung hay\n" +
                            "\n",
                    "ONE");









            comicsDB.insertComics("Sakamoto Days",
                                "https://i.pinimg.com/564x/9f/02/e6/9f02e63738bd356d9ae3983a6310a59c.jpg",
                                "Hành Động",
                                    0,
                                    "SakamotoDays.pdf",
                                    "Sakamoto Days kể về một sát thủ lừng lẫy trong thế giới ngầm" +
                                            " là Taro Sakamoto. Tay nghề và sức mạnh của Sakamoto từng khiến" +
                                            " cho mọi kẻ thù phải run sợ và không hề có địch thủ. Thế nhưng một" +
                                            " ngày, anh lại gặp được một người phụ nữ và trót yêu cô ấy. Với lời" +
                                            " thề sẽ không giết người nữa, Sakamoto từ bỏ làm sát thủ, kết hôn và có" +
                                            " con. Kết cục, anh trở thành một người đàn ông có thân hình béo ú làm chủ" +
                                            " cửa hàng tạp hóa.",
                                "Suzuki Yuto");


            comicsDB.insertComics("Lookism",
                                "https://i.pinimg.com/564x/e3/d3/4f/e3d34f7bcb34e8f7d8f105aa77ed3d19.jpg",
                                "Hành Động",
                                    0,
                                   "Lookism.pdf" ,
                                    "Park Hyung Suk, béo và xấu xí, luôn bị lôi" +
                                            " ra làm trò cười và bắt nạt ở trường. Nhưng" +
                                            " có một phép màu đã xảy ra....",
                                "Park Tae Yoon");







            comicsDB.insertComics("ChainSaw Man"
                    , "https://i.pinimg.com/564x/d9/96/0d/d9960d110dfa76669917909e1b5d2a8d.jpg",
                    "Hành Động",
                    0,
                    "ChainSawMan.pdf",
                    "Tác giả của \"Fire Punch\" lần đầu tiên xuất hiện trên Shonen Jump với câu chuyện về một Dark Hero! \n" +
                            "Cậu thiếu niên Denji sống một cuộc sống nghèo khổ và phải làm việc vất vả để trả nợ. Cậu vừa sống vừa" +
                            " làm Thợ Săn Qủy cùng với Pochita - loài quỷ Chainsaw, nhưng rồi một ngày cậu trở thành mục tiêu của mọt" +
                            " con quỷ tàn bạo...",
                    "Fujimoto Tatsuki");



            comicsDB.insertComics("Dr.Stone",
                    "https://i.pinimg.com/564x/ad/90/ad/ad90ad602392e3fd3f00f6ec1997cffa.jpg",
                    "Khoa Học",
                    0,
                    "DrStone.pdf",
                    "Vào một ngày đẹp trời nọ, như bao ngày bình thường khác trên thế giới. Khi các học" +
                            " sinh vẫn cắp sách đến trường, vẫn thí nghiệm trong phòng lab, vẫn gọi nhau ra để" +
                            " tỏ tình,... thì bổng trên trời xuất hiện một luồng sáng lạ lướt qua bề mặt thế giới." +
                            " Nhân loại bị hoá đá, mọi quốc gia ngừng hoạt động, thế giới… mất đi sự tồn tại của khoa" +
                            " học. 3700 năm sau, nhân loại đầu tiên được đánh thức sau giấc ngủ dài. Một học sinh trung" +
                            " học, với mái tóc kì quặc, và tình yêu khoa học vô biên. Cậu học sinh đó chính là hy vọng phục" +
                            " hưng lại nền văn minh nhân loại…",
                    "Riichiro Inagaki");


            comicsDB.insertComics("Spy X Family",
                    "https://i.pinimg.com/564x/7c/4d/9d/7c4d9d8d6609d445958c6a8c6bd283f8.jpg",
                    "Hành Động",
                    0,
                    "SpyxFamily.pdf",
                    "Bộ manga được viết và minh họa bởi Endo Tetsuya. Bộ truyện được đăng tải mỗi" +
                            " 2 tuần trên tạp chí điện tử Shōnen Jump + kể từ ngày 25 tháng 3 năm 2019." +
                            " Shueisha đồng thời cũng xuất bản bộ truyện với phiên bản tiếng Anh miễn phí" +
                            " trên trên ứng dụng và trang web Manga Plus. Viz Media cũng tiến hành xuất" +
                            " bản bộ truyện phiên bản tiếng Anh miễn phí trên nền tảng kĩ thuật số vào ngày 22" +
                            " tháng 9 năm 2019. Bản in đầu tiên được phát hành vào mùa xuân năm 2020. " +
                            "Tại Việt Nam, bộ truyện được mua bản quyền bởi Nhà xuất bản Kim Đồng với tập đầu tiên " +
                            "được xuất bản vào ngày 30 tháng 10 năm 2020.",
                    "Endou Tatsuya");


            comicsDB.insertComics("Vinland Saga",
                    "https://i.pinimg.com/564x/60/72/b7/6072b7b73652bb10edff0990678194a5.jpg",
                    "Hành Động",
                    0,
                    "VinlandSaga.pdf",
                    "Chín năm về trước, một nhà du hành người Iceland có tên là Thorfinn muốn gặp" +
                            " chốn thiên đường có tên là Vinland. Nhưng một ngày, người Viking tới làng" +
                            " của Thorfinn với đội trưởng ma mãnh của họ là Askeladd và đã giết cha của" +
                            " cậu bé là Thors,. Sau cái chết của cha, Thorfinn tham gia hạm đội của Askeladd" +
                            " nhằm trả thù cho cha cậu.",
                    "Yukimura Makoto");







            comicsDB.insertComics("Blue Lock",
                    "https://i.pinimg.com/564x/23/15/a7/2315a7691d3db1656badeb957b03794e.jpg",
                    "Thể Thao",
                    0,
                    "BlueLock.pdf",
                    "Yoichi Isagi đã bỏ lỡ cơ hội tham dự giải Cao Trung toàn quốc do đã chuyền cho đồng đội thay" +
                            " vì tự thân mình dứt điểm. Cậu là một trong 300 chân sút U-18 được tuyển chọn bởi Jinpachi" +
                            " Ego, người đàn ông được Hiệp Hội Bóng Đá Nhật Bản thuê sau hồi FIFA World Cup năm 2018, nhằm" +
                            " dẫn dắt Nhật Bản vô địch World Cup bằng cách tiêu diệt nền bóng đá Nhật Bản. Kế hoạch của Ego" +
                            " gồm việc cô lập 300 tay sút trong một nhà ngục - dưới một tổ chức với tên gọi là \"Blue Lock\"" +
                            ", với mục tiêu là tạo ra chân sút \"tự phụ\" nhất thế giới, điều mà nền bóng đá Nhật Bản còn thiếu.",
                    "Nomura Yusuke");


            comicsDB.insertComics("Thể Thao Cực Hạn",
                    "https://i.pinimg.com/564x/6f/80/0e/6f800e46bda8ab90e58cd2fb8da442b8.jpg",
                    "Thể Thao",
                    0,
                    "WindBreaker.pdf",
                    "Tên khác: Wind Breaker \n" +
                            "\"Thể Thao Mạo Hiểm\"  và đây cũng là truyện trẻ" +
                            " trâu hư cấu. Tôi giả thuyết rằng các bạn biết thực tế " +
                            "và truyện tranh là khác nhau. Vậy nên luôn đội mũ bảo hiểm",
                    "Ju Jong Seuk");



            comicsDB.insertComics("Tình Yêu Giả Tạo",
                    "https://i.pinimg.com/564x/5f/62/6a/5f626a6e9969a26831f5bfdc8deac55b.jpg",
                    "Tình Cảm",
                    0,
                    "NiseKoi.pdf",
                    "Em sẽ giữ chìa, còn anh sẽ giữ ổ khóa. Sau này nếu mình được gặp lại nhau thì" +
                            " đây sẽ là thứ chúng ta dùng để nhận ra nhau, và khi đó, chúng ta sẽ… cưới nhau”" +
                            ". Tuổi thơ con người thật hồn nhiên và trong sáng, nhìn cảnh hai đứa trẻ mới tí " +
                            "tuổi đầu đã nói mấy lời đỡ không nổi như thế thật đáng yêu biết bao…\n" +
                            "Con người là thế… Ai cũng mong rằng mọi thứ sẽ có được một kết quả như những câu chuyện cổ tích…\n" +
                            "Ấy thế mà…\n" +
                            "Có những lúc sự thật lại không như con người mong muốn.\n" +
                            "Rồi cái ngày định mệnh, ngày hai đứa gặp lại, mọi chuyện sẽ ra sao?",
                    "Komi Naoshi");





          comicsDB.insertComics("Yamada-Kun To 7 Nin No",
                  "https://i.pinimg.com/564x/b9/be/9e/b9be9e32822f641890f29aae938d24cd.jpg",
                  "Tình Cảm",
                  0,
                  "YamadaKun.pdf",
                  "Yamada Ryuu là học sinh năm 2 tại trường cấp 3 Suzaku. Cậu ta là một kẻ" +
                          " chuyên đi trễ về sớm, ngủ gật trong lớp và điểm số dĩ nhiên là bê bết" +
                          ". Cậu ta cảm thấy đời chán như con gián. Shiraishi Urara, ngược lại, l" +
                          "à học sinh sáng giá nhất khối, thông minh lẫn xinh đẹp đủ cả. Rồi một hôm" +
                          ", một chuyện kì lạ đã xảy ra và hai con người này đã bị hoán đổi thân xác " +
                          "cho nhau! Xem để biết thêm chi tiết!",
                  "Yoshikawa Miki");
          


          comicsDB.insertComics("How To Fight !",
                  "https://i.pinimg.com/564x/3e/a4/e1/3ea4e1596d1ed408c958667a3c7008ea.jpg",
                  "Hành Động",
                  0,
                  "HowToFight.pdf",
                  "Yoo Hobin luôn bị bắt nạt bởi vì nó là một thằng loser chính hiệu. Tuy nhiên" +
                          " một sự kiện bất ngờ đã đảo lộn cuộc sống của cậu ta. Một cái video tình cờ " +
                          "tải lên mạng làm cậu ta trở nên nổi tiếng, quá tuyệt vời! Càng ngày càng có " +
                          "nhiều người theo dõi và cậu ta còn kiếm ra tiền từ cái vid tình cờ đó nữa! Tuy" +
                          " nhiên, vì chỉ là tình cờ nên cậu ta không thể nào kiếm ra một cái video nào khác" +
                          " như thế nữa. Phát cuồng vì vòng xoáy tiền tài và danh vọng có thể đem lại cho mình," +
                          " cậu ta lên kế hoạch tạo ra những video thật độc đáo để kiếm thêm người theo dõi. Nhưng" +
                          " để làm ra chúng, thì đầu tiên cậu ta phải biết chiến đấu",
                  "Bak Tae-Jun");
        }
    }
}
