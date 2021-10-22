package com.jpa.librarymanagement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.librarymanagement.entity.BookGenres;
import com.jpa.librarymanagement.entity.SystemSettings;
import com.jpa.librarymanagement.repository.BookGenresRepository;
import com.jpa.librarymanagement.repository.SystemSettingsRepository;

@Service
public class DAOService {
	@Autowired
	private BookGenresRepository bookGenresRepository;
	@Autowired
	private SystemSettingsRepository settingsRepository;

	
	//Book Genres
	public BookGenres createGenre(BookGenres bookGenres) throws Exception {
		BookGenres lBookGenres = null;
		try {
			lBookGenres = bookGenresRepository.save(bookGenres);
		} catch (Exception exception) {
			Exception excep = new Exception("Exception while creating book genre", exception);
			throw excep;
		}
		return lBookGenres;
	}


	public BookGenres updateGenre(BookGenres bookGenres) throws Exception {
		BookGenres lBookGenres = null;
		try {
			lBookGenres = bookGenresRepository.findById(bookGenres.getGenreId()).orElse(null);
			lBookGenres.setGenre_name(bookGenres.getGenre_name());
		} catch (Exception exception) {
			Exception excep = new Exception("Exception while deleting the book genre", exception);
			throw excep;
		}
		return bookGenresRepository.save(lBookGenres);
	}
	
	public String deleteGenre(int genreId) throws Exception {
		try {
			bookGenresRepository.deleteById(genreId);
		} catch (Exception exception) {
			Exception excep = new Exception("Exception while deleting the book genre", exception);
			throw excep;
		}
		return "Genere deleted sucessfully" + genreId;
	}
	
	//System Settings
	public SystemSettings createSetting(SystemSettings systemSetting) throws Exception {
		SystemSettings lSystemSettings = null;
		try {
			lSystemSettings = settingsRepository.save(systemSetting);
		} catch (Exception exception) {
			Exception excep = new Exception("Exception while creating setting", exception);
			throw excep;
		}
		return lSystemSettings;
	}

	public String deleteSetting(int settingId) throws Exception {
		try {
			settingsRepository.deleteById(settingId);
		} catch (Exception exception) {
			Exception excep = new Exception("Exception while deleting setting", exception);
			throw excep;
		}
		return "Genere deleted sucessfully" + settingId;
	}

	public SystemSettings updateSetting(SystemSettings systemSettings) throws Exception {
		SystemSettings lSystemSettings = null;
		try {
			lSystemSettings = settingsRepository.findById(systemSettings.getSettingId()).orElse(null);
			lSystemSettings.setSettingName(systemSettings.getSettingName());
			lSystemSettings.setSettingValue(systemSettings.getSettingValue());
		} catch (Exception exception) {
			Exception excep = new Exception("Exception while deleting the book genre", exception);
			throw excep;
		}
		return settingsRepository.save(lSystemSettings);
	}
	
	
}
