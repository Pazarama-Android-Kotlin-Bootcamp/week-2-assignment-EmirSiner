# homework-2

## Ödev 1 

Lifecyle Nedir? Nasıl yönetiriz? Ne gibi problemler olur ve nasıl kaçarız?

## Ödev 2

Derste birlikte yapılan Sign ve Sign Up sayfaların tasarımlarının yapılması. Bu iki tasarımı İki Activity olarak yapılacak ve Sign up butuna basıldığında Sign Up ekranı gelmesi beklenmekte.


## Lifecyle Nedir?
Activity ,uygulamalar da nelerin değiştiğini,yüklendiğini bildirmesini sağlayan ve bu eylemlerle bağlantılı olarak uygulamanın ilerleyişini,sonlandırılmasını,durdurulmasını sağlamak amacı ile kullanılmaktadır.Bu sayede kullanıcı uygulamadan çıktığında ya da girdiğinde haber almamızı sağlar.

Activity’lerin çalışma prensibi şu prensiplerden oluşur.
onCreate(), onStart(), onResume(), onPause(), onStop(), onDestroy()

## onCreate() Methodu
Activity ilk açıldığında gerçekleşen olayları içinde barındırır.Mutlaka her uygulama olması gereken en önemli methodlardan biridir.Ayrıca uygulama başladığında çalışır ve yapılan işlemlerde tekrardan çalışmasına gerek yoktur.

## onCreate() methodu 
geliştiricinin oluşturduğu viewmodelleri ,nesneleri ya da veri alışverişini sağlayabilir ve bu işlemleri yapmak için savedInstanceState parametresinden yardım alır.Diğer bir yardımcısı ise setContentView() elemanıdır.Bu eleman kullanıcı arayüzünde gösterilmesi istenen xml tasarımı göstermesini sağlar.

## onStart() Methodu
Uygulamamızı açtığımızda onCreate() methodundan sonra çalışan methodtur.Burası kullanıcın gördüğü UI yı başlatıldığı gösterildiği yerdir.Bu method çok hızlı bir şekilde gerçekleşip devamında onResume() methoduna yerini bırakır.

## onResume() Methodu
Uygulama başladıktan sonra yapılacak işlemler devamlı durumda olacağı için bu method çağrılır.Uygulamadan çıkılmadığı sürece burada devam edilir.Eğer uygulamamın akışını değiştirecek bir olay gerçekleştiğinde onPause() methodu devreye girer.Sistem tekrar eski durumuna geldiğinde onResume() methoduna geri döner.Örneğin bir kamera uygulaması yaptığımızı düşünelim.kamerayı aktif edeceğimiz kod bloğunu onResume() methodunda yazabiliriz.çünkü uygulamamızın sonlandırılmasını istemeyiz.Diğer methodlarda da yazabiliriz lakin bu pek tavsiye edilmez.

## onPause() Methodu
Sistem uygulamanın bir nevi kapandığını bildirdiği zaman çalışır.Yani uygulamamız arkaplana atıldığı zaman ,arama geldiği zaman ya da başka bir uygulama açıldığı zaman bu method çalışır.Bunun için birkaç neden olarak şunlar vardır :

## onResume() methodunda 
açıklandığı gibi uygulama kesintiye girdiğinde oluşur.Bu en yaygın durumdur.
Android 7.0(API 24) ve yukarısı için çoklu penceresi özelliği aktif olabilmesi için.sistem bir uygulamayı ön planda tutarak diğer ugulamaları kesintiye uğratır.
uygulama üzerinde telefondan kaynaklı bir uyarı penceresi vb. dialog açıldığında uygulamamız çalışır gibi görünse de aslında duraklatılmış ve kesintiye uğramıştır.
Yani onPause() methodunu kulllanmaktaki amacımız uygulamamız çalışırken herhangi bir yerde duraklatıldığı zaman gerçekleştirilmesi istenen işlemlerimizi yaparız.

Lakin sistem arkaplandan silindiğinde yda başka bir durumda kapandığında onStop() methodu devreye girer.

## onStop() Methodu
Kullanıcı uygulamadan çıkış yaptığında buradaki kodlar çalışmaktadır.Herhangi bir işlemi uygulama kapatırken sonlardırmak istersek bu işlemi burada yapabiliriz.Bu methodun kullanılması CPU da gereksiz işlemlerin kapatılmasına da yardım olarak uygulamamız kullanıcıya çok farkettirmese de kullanıcı dostu olur 👱.

Eğer kullanıcı uygulama ile etkileşimi komple bitti ise onDestory() methodu çalışır.

## onDestory() methodu
Bu method kullanıcı ile bağlantısı kalmayan uygulamanın arkaplanı temizlemek için kullanılır.



                           
                                  
