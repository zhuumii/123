public class AICodingDemo1 {

    public static void main(String[] args) {
        import java.util.List;

/**
 * T2 删除图书功能的测试：覆盖删除主流程、编号不复用、删后全链路、边界条件。
 */
        public class DeleteTest {

            /** 删除存在的图书应返回"删除成功"，且 listAll 不再包含该书 */
            public void testDeleteSuccess() {
                Library library = new Library(true);
                Assert.assertEquals("删除成功", library.delete(2), "删除编号 2 应成功");
                List<Book> books = library.listAll();
                Assert.assertEquals(2, books.size(), "删除后应剩 2 本");
                Assert.assertEquals(1, books.get(0).getId(), "剩余第一本编号为 1");
                Assert.assertEquals(3, books.get(1).getId(), "剩余第二本编号为 3");
            }

            /** 删除不存在的编号应返回"图书编号不存在" */
            public void testDeleteNonExistent() {
                Library library = new Library(true);
                Assert.assertEquals("图书编号不存在", library.delete(99), "删除不存在的编号应提示不存在");
                Assert.assertEquals(3, library.listAll().size(), "删除失败不应影响书库");
            }

            /** 重复删除同一编号：第二次应提示"图书编号不存在" */
            public void testDeleteTwice() {
                Library library = new Library(true);
                Assert.assertEquals("删除成功", library.delete(1), "首次删除应成功");
                Assert.assertEquals("图书编号不存在", library.delete(1), "重复删除应提示不存在");
            }

            /** 删除后 add 编号不复用：删编号 2 后再添加，新书编号应为 4（不是 2） */
            public void testDeleteDoesNotReuseId() {
                Library library = new Library(true);
                Assert.assertEquals("删除成功", library.delete(2), "删除编号 2");
                Book newBook = library.add("新书", "测试", 30.0);
                Assert.assertEquals(4, newBook.getId(), "删除后添加编号应为 4（不复用 2）");
            }

            /** 删光全部后再添加，编号延续历史最大值 */
            public void testDeleteAllThenAdd() {
                Library library = new Library(true);
                library.delete(1);
                library.delete(2);
                library.delete(3);
                Assert.assertEquals(0, library.listAll().size(), "删光后应为空");
                Book book = library.add("新书", "作者", 20.0);
                Assert.assertEquals(4, book.getId(), "删光后添加编号应为 4");
            }

            /** 已分配的编号再添加后删除再添加，编号继续递增不复用 */
            public void testIdContinuesAfterDeleteAndReAdd() {
                Library library = new Library(true);
                library.delete(1);
                library.delete(2);
                library.delete(3);
                Book b4 = library.add("书A", "作者", 10.0);
                Assert.assertEquals(4, b4.getId(), "首次添加得 4");
                library.delete(4);
                Assert.assertEquals(0, library.listAll().size(), "删光后应为空");
                Book b5 = library.add("书B", "作者", 20.0);
                Assert.assertEquals(5, b5.getId(), "再次添加编号应为 5（不复用 4）");
            }

            /** 删除后被删除的编号再借阅应提示"图书编号不存在" */
            public void testBorrowAfterDelete() {
                Library library = new Library(true);
                Assert.assertEquals("删除成功", library.delete(1), "删除编号 1");
                Assert.assertEquals("图书编号不存在", library.borrow(1), "删除后借阅应提示不存在");
            }

            /** 删除后被删除的编号再归还应提示"图书不存在" */
            public void testReturnAfterDelete() {
                Library library = new Library(true);
                Assert.assertEquals("删除成功", library.delete(1), "删除编号 1");
                Assert.assertEquals("图书编号不存在", library.returnBook(1), "删除后归还应提示不存在");
            }

            /** 删除后搜索不受影响：被删的书搜不到，剩余的书仍可搜到 */
            public void testSearchAfterDelete() {
                Library library = new Library(true);
                Assert.assertEquals("删除成功", library.delete(2), "删除《数据结构》");
                Assert.assertEquals(0, library.search("数据结构").size(), "删除后搜不到");
                Assert.assertEquals(1, library.search("Java").size(), "剩余书仍可搜索");
            }

            /** 删除编号 0 和负数应提示"图书编号不存在" */
            public void testDeleteZeroAndNegative() {
                Library library = new Library(true);
                Assert.assertEquals("图书编号不存在", library.delete(0), "编号 0 不存在");
                Assert.assertEquals("图书编号不存在", library.delete(-1), "负编号不存在");
                Assert.assertEquals(3, library.listAll().size(), "无效删除不影响书库");
            }
        }

    }
}
