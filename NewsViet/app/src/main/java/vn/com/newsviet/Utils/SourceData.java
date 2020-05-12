package vn.com.newsviet.Utils;

import java.util.ArrayList;

import vn.com.newsviet.model.News;

public class SourceData {
    public static ArrayList<News> getDataTabExpress() {
        ArrayList<News> arrayListTabExpress = new ArrayList();
        arrayListTabExpress.add(new News("Trang chủ", "https://vnexpress.net/rss/tin-moi-nhat.rss"));
        arrayListTabExpress.add(new News("Thời sự", "https://vnexpress.net/rss/thoi-su.rss"));
        arrayListTabExpress.add(new News("Thế giới", "https://vnexpress.net/rss/the-gioi.rss"));
        arrayListTabExpress.add(new News("Kinh doanh", "https://vnexpress.net/rss/kinh-doanh.rss"));
        arrayListTabExpress.add(new News("Startup", "https://vnexpress.net/rss/startup.rss"));
        arrayListTabExpress.add(new News("Giải trí", "https://vnexpress.net/rss/giai-tri.rss"));
        arrayListTabExpress.add(new News("Thể thao", "https://vnexpress.net/rss/the-thao.rss"));
        arrayListTabExpress.add(new News("Pháp luật", "https://vnexpress.net/rss/phap-luat.rss"));
        arrayListTabExpress.add(new News("Giáo dục", "https://vnexpress.net/rss/giao-duc.rss"));
        arrayListTabExpress.add(new News("Sức khỏe", "https://vnexpress.net/rss/suc-khoe.rss"));
        arrayListTabExpress.add(new News("Đời sống", "https://vnexpress.net/rss/gia-dinh.rss"));
        arrayListTabExpress.add(new News("Du lịch", "https://vnexpress.net/rss/du-lich.rss"));
        arrayListTabExpress.add(new News("Khoa học", "https://vnexpress.net/rss/khoa-hoc.rss"));
        arrayListTabExpress.add(new News("Số hóa", "https://vnexpress.net/rss/so-hoa.rss"));
        arrayListTabExpress.add(new News("Xe", "https://vnexpress.net/rss/oto-xe-may.rss"));
        arrayListTabExpress.add(new News("Cộng đồng", "https://vnexpress.net/rss/cong-dong.rss"));
        arrayListTabExpress.add(new News("Tâm sự", "https://vnexpress.net/rss/tam-su.rss"));
        arrayListTabExpress.add(new News("Cười", "https://vnexpress.net/rss/cuoi.rss"));
        return arrayListTabExpress;
    }

    public static ArrayList<News> getDataTab24h() {
        ArrayList<News> arrayListTab24h = new ArrayList();
        //arrayListTab24h.add(new News("Trang chủ", "https://cdn.24h.com.vn/upload/rss/trangchu24h.rss"));
        arrayListTab24h.add(new News("Tin tức trong ngày", "https://cdn.24h.com.vn/upload/rss/tintuctrongngay.rss"));
        arrayListTab24h.add(new News("Bóng đá", "https://cdn.24h.com.vn/upload/rss/bongda.rss"));
        arrayListTab24h.add(new News("ASIAN CUP 2019", "https://cdn.24h.com.vn/upload/rss/asiancup2019.rss"));
        arrayListTab24h.add(new News("An ninh - Hình sự", "https://cdn.24h.com.vn/upload/rss/anninhhinhsu.rss"));
        arrayListTab24h.add(new News("Thời trang", "https://cdn.24h.com.vn/upload/rss/thoitrang.rss"));
        arrayListTab24h.add(new News("Thời trang Hi-tech", "https://cdn.24h.com.vn/upload/rss/thoitranghitech.rss"));
        arrayListTab24h.add(new News("Tài chính – Bất động sản", "https://cdn.24h.com.vn/upload/rss/taichinhbatdongsan.rss"));
        arrayListTab24h.add(new News("Ẩm thực", "https://cdn.24h.com.vn/upload/rss/amthuc.rss"));
        arrayListTab24h.add(new News("Làm đẹp", "https://cdn.24h.com.vn/upload/rss/lamdep.rss"));
        arrayListTab24h.add(new News("Phim", "https://cdn.24h.com.vn/upload/rss/phim.rss"));
        arrayListTab24h.add(new News("Giáo dục - du học", "https://cdn.24h.com.vn/upload/rss/giaoducduhoc.rss"));
        arrayListTab24h.add(new News("Bạn trẻ - Cuộc sống", "https://cdn.24h.com.vn/upload/rss/bantrecuocsong.rss"));
        arrayListTab24h.add(new News("Ca nhạc - MTV", "https://cdn.24h.com.vn/upload/rss/canhacmtv.rss"));
        arrayListTab24h.add(new News("Phi thường - kỳ quặc", "https://cdn.24h.com.vn/upload/rss/phithuongkyquac.rss"));
        arrayListTab24h.add(new News("Công nghệ thông tin", "https://cdn.24h.com.vn/upload/rss/congnghethongtin.rss"));
        arrayListTab24h.add(new News("Ô tô", "https://cdn.24h.com.vn/upload/rss/oto.rss"));
        arrayListTab24h.add(new News("Thị trường - Tiêu dùng", "https://cdn.24h.com.vn/upload/rss/thitruongtieudung.rss"));
        arrayListTab24h.add(new News("Du lịch", "https://cdn.24h.com.vn/upload/rss/dulich24h.rss"));
        arrayListTab24h.add(new News("Sức khỏe đời sống", "https://cdn.24h.com.vn/upload/rss/suckhoedoisong.rss"));
        arrayListTab24h.add(new News("Cười 24h", "https://cdn.24h.com.vn/upload/rss/cuoi24h.rss"));
        return arrayListTab24h;
    }


}
