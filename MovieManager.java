public class MovieManager {
    //region Movies

    private Movie movie1 = new Movie(1, "Yüzüklerin Efendisi: Yüzük Kardeşliği", "Peter Jackson",
            new String[]{"Orlando Bloom", "Elijah Wood", "Andy Serkis", "Ian McKellen", "Hugo Weaving", "Ian Holm"},
            "2001", "Çok eski çağlarda Elf demircileri, güç yüzüklerini sihirli ustalıklarıyla yapmış ve " +
            "Karanlıkların Efendisi Sauron, bu yüzükleri işleyip kendi gücüyle doldurmuştur. Daha sonra kendisinden çalınan, " +
            "diğer tüm yüzüklere hükmeden, Tek Yüzüğü bütün gücüyle tüm Orta Dünya'da aramasına rağmen bulamamıştır. Yüzük," +
            " Shire Bölgesi'nde yaşayan Frodo Baggins adlı bir hobbitte bulunmaktadır. Ancak çok büyük bir güce sahip bu " +
            "yüzüğü yok etmek gerekmektedir. Frodo ve arkadaşları, diğer ırklardan gelen arkadaşlarıyla birlikte yüzük " +
            "kardeşliğini oluşturur ve hepsi bu yolculukta büyücü Gri Gandalf'ı izler.", "Fantastik");
    private Movie movie2 = new Movie(2, "Yüzüklerin Efendisi: İki Kule", "Peter Jackson",
            new String[]{"Elijah Wood", "Andy Serkis", "Ian McKellen", "Hugo Weaving", "David Wenham"}, "2002",
            "İki kule, Emyn Muil tepelerinde " +
                    "başlar. Yollarını kaybetmiş " +
                    "Hobbitler Frodo ve Sam, esrarengiz Gollum'un kendilerini takip ettiğini farkederler ve onu kıskıvrak yakalarlar. Bir " +
                    "zamanlar bir Hobbit olan ve beş yüz yıl sahip olduğu Yüzük tarafından bozulup bir yaratığa dönüştürülen Gollum, " +
                    "kendisini serbest bırakmaları karşılığında, Hobbitleri Mordor'un Kara Kapıları’na götürmeye söz verir. Sam, bu " +
                    "yeni yol arkadaşına güvenmemektedir. Frodo ise bir zamanlar kendisi gibi bu yüzüğü taşıyan Gollum'a acımaktadır. " +
                    "Frodo başka şansı kalmadığı için Gollum'u izler.", "Fantastik");
    private Movie movie3 = new Movie(3, "Esaretin Bedeli", "Frank Darabont", new String[]{"Tim Robbins", "Morgan Freeman", "Bob Gunton", "James Whitmore"},
            "1994", "Genç ve başarılı bir bankacı olan Andy Dufresne, karısını ve onun sevgilisini öldürmek suçundan" +
            " ömür boyu hapse mahkum edilir ve Shawshank hapishanesine gönderilir. Burada başta Red olmak üzere yeni arkadaşlar edinir." +
            " Hapishane yaşamını uyum sağlamaya çalışırken diğer yandan da bilgisi ve kültürüyle etrafındaki insanları etkilemeyi başaracaktır."
            , "Dram");
    private Movie movie4 = new Movie(4, "Sil Baştan", "Michel Gondry", new String[]{"Jim Carrey", "Kate Winslet", "Mark Ruffalo", "Kristen Dunst"},
            "2004", "Joel Barish (Jim Carrey)'in eski sevgilisi Clementine (Kate Winslet) yaşadıkları iki yıllık " +
            "ilişkiye dair tüm anılarını gizemli tıbbi bir müdahale ile kafasından sildirir. Bunu öğrenen Joel çok üzülür ve aynı" +
            " prosedürü kendi üzerinde uygulatmaya karar verir. Bütün anılarını sildirmek için derin uykuya yattığında, gözlerinin " +
            "önünden Clementine ile yaşadığı günler geçer. Joel aslında Clementine'i unutmak istemediğini anlar ve müdahaleyi " +
            "durdurmak için çabalar.", "Romantik");
    private Movie movie5 = new Movie(5, "Felekten Bir Gece", "Todd Philips", new String[]{"Justin Bartha", "Mike Epps", "Jeffrey Tambor", "Heather Graham"}
            , "2009", "Filmde arkadaşlarının düğününden iki gün önce bekarlığa veda partisi vermek için Las Vegas'a giden dört arkadaş," +
            "sarhoş oldukları parti gecesinin sabahında odalarında bir kaplan, tavuklar ve dolapta ağlayan altı aylık bir bebek ile" +
            " uyanırlar. Ayrıca damat ortada yoktur. Bir gece öncesine dair hiçbirşey hatırlamayan üç arkadaş ip uclarını takip " +
            "ederek işlerin nerede kontrolden çıktığını bulmak zorundadırlar. En önemlisi de damadı bularak zamanında Los Angeles'a " +
            "düğününe yetiştirmeleri gerekmektedir.", "Komedi");
    private Movie[] movies = new Movie[]{movie1, movie2, movie3, movie4, movie5};
    //endregion

    public Movie[] getMovies() {
        return movies;
    }

    public void setMovies(Movie[] movies) {
        this.movies = movies;
    }

    private int movieCount = 0;

    public void addMovie(Movie movie) {
        if (movieCount == movies.length - 1) {
            reInitializeArray();
        }
        movies[movieCount] = movie;
        System.out.println("Eklenen film: " + movie);
        movieCount++;
    }
    private void reInitializeArray() {
        Movie[] newMovieArray = new Movie[movies.length + DomainConstants.FILM_OPENING_COUNT];
        System.arraycopy(movies, 0, newMovieArray, 0, movies.length);
        movies = newMovieArray;
    }

    public void deleteMovie(Movie movie){
        System.out.println(movie.getTitle()+" isimli film silindi.");
    }
    public Movie searchMovieById(int movieId) {
        Movie searchedMovie = null;
        for (Movie movie : movies) {
            if (movie.getId() == movieId) {
                searchedMovie = movie;
                break;
            }

        }
        return searchedMovie;

    }

    public Movie searchMovieByTitle(String searchTitle) {
        Movie searchedMovie = null;
        for (Movie movie : movies) {
            if (movie.getTitle().equalsIgnoreCase(searchTitle)) {
                searchedMovie = movie;
                System.out.println("Bulunan film: "+ movie);
                break;
            }
        }
        return searchedMovie;
    }
    public void listMovies(){
        for (Movie movie:movies) {
            System.out.println(movie);
        }
    }


}
