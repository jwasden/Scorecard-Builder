package scorecardBuilder;


import javafx.beans.InvalidationListener;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

import java.util.*;

public class Scorecard {

private String description;
private String date;
private List<Project> scorecardProjects = new ObservableList<Project>() {
    @Override
    public void addListener(InvalidationListener listener) {

    }

    @Override
    public void removeListener(InvalidationListener listener) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Project> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Project project) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Project> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Project> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Project get(int index) {
        return null;
    }

    @Override
    public Project set(int index, Project element) {
        return null;
    }

    @Override
    public void add(int index, Project element) {

    }

    @Override
    public Project remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Project> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Project> listIterator(int index) {
        return null;
    }

    @Override
    public List<Project> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public void addListener(ListChangeListener<? super Project> listener) {

    }

    @Override
    public void removeListener(ListChangeListener<? super Project> listener) {

    }

    @Override
    public boolean addAll(Project... elements) {
        return false;
    }

    @Override
    public boolean setAll(Project... elements) {
        return false;
    }

    @Override
    public boolean setAll(Collection<? extends Project> col) {
        return false;
    }

    @Override
    public boolean removeAll(Project... elements) {
        return false;
    }

    @Override
    public boolean retainAll(Project... elements) {
        return false;
    }

    @Override
    public void remove(int from, int to) {

    }

//    @Override
//    public void addListener(InvalidationListener listener) {
//
//    }
//
//    @Override
//    public void removeListener(InvalidationListener listener) {
//
//    }
//
//    @Override
//    public int size() {
//        return 0;
//    }
//
//    @Override
//    public boolean isEmpty() {
//        return false;
//    }
//
//    @Override
//    public boolean contains(Object o) {
//        return false;
//    }
//
//    @Override
//    public Iterator<Project> iterator() {
//        return null;
//    }
//
//    @Override
//    public Object[] toArray() {
//        return new Object[0];
//    }
//
//    @Override
//    public <T> T[] toArray(T[] a) {
//        return null;
//    }
//
//    @Override
//    public boolean add(Project project) {
//        return false;
//    }
//
//    @Override
//    public boolean remove(Object o) {
//        return false;
//    }
//
//    @Override
//    public boolean containsAll(Collection<?> c) {
//        return false;
//    }
//
//    @Override
//    public boolean addAll(Collection<? extends Project> c) {
//        return false;
//    }
//
//    @Override
//    public boolean addAll(int index, Collection<? extends Project> c) {
//        return false;
//    }
//
//    @Override
//    public boolean removeAll(Collection<?> c) {
//        return false;
//    }
//
//    @Override
//    public boolean retainAll(Collection<?> c) {
//        return false;
//    }
//
//    @Override
//    public void clear() {
//
//    }
//
//    @Override
//    public Project get(int index) {
//        return null;
//    }
//
//    @Override
//    public Project set(int index, Project element) {
//        return null;
//    }
//
//    @Override
//    public void add(int index, Project element) {
//
//    }
//
//    @Override
//    public Project remove(int index) {
//        return null;
//    }
//
//    @Override
//    public int indexOf(Object o) {
//        return 0;
//    }
//
//    @Override
//    public int lastIndexOf(Object o) {
//        return 0;
//    }
//
//    @Override
//    public ListIterator<Project> listIterator() {
//        return null;
//    }
//
//    @Override
//    public ListIterator<Project> listIterator(int index) {
//        return null;
//    }
//
//    @Override
//    public List<Project> subList(int fromIndex, int toIndex) {
//        return null;
//    }
//
//    @Override
//    public void addListener(ListChangeListener<? super Project> listener) {
//
//    }
//
//    @Override
//    public void removeListener(ListChangeListener<? super Project> listener) {
//
//    }
//
//    @Override
//    public boolean addAll(Project... elements) {
//        return false;
//    }
//
//    @Override
//    public boolean setAll(Project... elements) {
//        return false;
//    }
//
//    @Override
//    public boolean setAll(Collection<? extends Project> col) {
//        return false;
//    }
//
//    @Override
//    public boolean removeAll(Project... elements) {
//        return false;
//    }
//
//    @Override
//    public boolean retainAll(Project... elements) {
//        return false;
//    }
//
//    @Override
//    public void remove(int from, int to) {
//
//    }
};

    public Scorecard(String description, String date) {
        this.description = description;
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Project> getScorecardProjects() {
        return scorecardProjects;
    }
//
//    public void setScorecardProjects(Map<Integer, Project> scorecardProjects) {
//        this.scorecardProjects = scorecardProjects;
//    }

    public void addProjectToScorecard(Project project) {
        this.scorecardProjects.add(project);
    }

}
