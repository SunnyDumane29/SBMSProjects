package in.sunnyit.service;

import in.sunnyit.dao.BookDao;

public class BookServiceImpl implements BookService {

	
	private BookDao bookDao;
	
	
	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}



	public void saveBook() {

		boolean status=bookDao.save();
		
		if(status)
		{
			System.out.println("Record inserted....");
		}
		else
		{
			System.out.println("Record inserted Failed....");
		}
	}

}
