package com.mergimrama.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Mergim on 22-Dec-17.
 */

public class CrimeLab {
    private static CrimeLab sCrimeLab;

    private List<Crime> mCrimes;

    public static CrimeLab get(Context context) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    private CrimeLab(Context context) {
        mCrimes = new ArrayList<>();

    }

    public void addCrime(Crime crime) {
        mCrimes.add(crime);
    }

    public boolean deleteCrime(Crime crime) {
        return mCrimes.remove(crime);
    }

    public Crime getCrime(UUID id) {
        for (Crime crime : mCrimes) {
            if (crime.getmId().equals(id)) {
                return crime;
            }
        }
        return null;
    }

    public List<Crime> getmCrimes() {
        return mCrimes;
    }
}
