/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tam.dev;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import tam.dev.data.dao.Database;
import tam.dev.data.dao.DatabaseDao;

/**
 *
 * @author Admin
 */
public class BaseServlet extends HttpServlet{
    @Override
    public void init() throws ServletException {
        super.init();  // Gọi phương thức init của HttpServlet để khởi tạo servlet
        DatabaseDao.init(new Database());  // Khởi tạo database
    }
}
