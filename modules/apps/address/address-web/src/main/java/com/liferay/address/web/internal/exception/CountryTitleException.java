package com.liferay.address.web.internal.exception;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.exception.PortalException;

/**
 * @author Huy Le Nguyen
 */
public class CountryTitleException extends PortalException {

	public CountryTitleException() {
	}

	public CountryTitleException(String msg) {
		super(msg);
	}

	public CountryTitleException(String msg, Throwable throwable) {
		super(msg, throwable);
	}

	public CountryTitleException(Throwable throwable) {
		super(throwable);
	}

	public static class MustNotExceedMaximumLength
		extends CountryTitleException {

		public MustNotExceedMaximumLength(String title, int titleMaxLength) {
			super(
				StringBundler.concat(
					"Title ", title, " must have fewer than ", titleMaxLength,
					" characters"));
		}

	}

}
