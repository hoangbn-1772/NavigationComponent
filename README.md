# NavigationComponent

## Overview

### Navigation là gì?
- Navigation nằm trong gói Jetpack, cho phép chuyển màn hình trong app.

### Navigation gồm 3 thành phần
- Navigation graph: là 1 file XML, chứa tất cả các thông tin màn hình liên quan đến navigation.
- NavHost: Hiển thị các màn hình điều hướng tương ứng
- NavController: Đối tượng quản lý điều hướng, hoán đổi màn hình hiển thị trong NavHost

### Một số lợi ích khác
- Xử lý fragment transactions
- Xử lý hành động UP và Back chính xác theo mặc định
- Cung cấp tài nguyên tiêu chuẩn cho animation và transitions.
- Thực hiện và xử lý deep linking
- Support: navigation drawer và bottom navigation
- Support ViewModel
- Safe Args

### Nguyên tắc
- Fixed start destination (Điểm bắt đầu): Mỗi app đều có điểm bắt đầu, Đây là màn hình đầu tiên người dùng nhìn thấy khi khởi chạy app, và đó cũng là điểm cuối khi
người dùng back.
- Trạng thái Navigation được thể hiện dưới dạng một stack.
- Up và back
- Deep linking simulates manual navigation

## Implement
- Step 1: Tạo navigation graph
	+ destinations: Là các điểm đến khác nhau trong app.
	+ actions: Là các kết nối hợp lý giữa các điểm đến.

## Tham khảo
- https://developer.android.com/guide/navigation/navigation-getting-started#navigate
- https://medium.com/google-developer-experts/android-navigation-components-part-2-ca643eb301e3
- https://viblo.asia/p/can-ban-ve-android-navigation-components-E375z0WWZGW
- https://viblo.asia/p/tong-hop-cac-cau-hoi-lien-quan-den-navigation-component-android-bWrZna3mKxw
- https://viblo.asia/p/navigation-architecture-component-part-1-oOVlYq4yl8W#_truyen-gui-du-lieu-mot-cach-an-toan-hon---args-plugin-cua-nagivation-architecture-architecture-11
- https://viblo.asia/p/navigation-architecture-component-part-2-eW65GEwOZDO#_navigation-giua-cac-activity-5
