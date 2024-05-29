package com.library.dao;

import java.util.List;

import com.library.Library;

public interface LibraryDao {

	void addLibrary(Library library);
	void updateLibrary(Library library, int libraryId);
	void deleteLibrary(int libraryId);
	Library getLibraryById(int libraryId);
	List<Library> getAllLibraries();
	
}
