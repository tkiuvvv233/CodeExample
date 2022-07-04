<script lang="ts">
import {computed} from '@vue/reactivity';
import ShowData from './components/ShowData.vue';

export default ({
  components: {ShowData},
  data() {
    return {
      title: "",
      DataList: []
    }
  },
  mounted() {
    this.axios({
      method: 'GET',
      url: 'http://localhost:8080/User/findUserAll'
    }).then((response) => {
      if (response.status == 200) {
        if (response.data.code == 200) {
          this.DataList = response.data.data
        } else {
          this.$message({message: response.data.msg, type: "error"})
        }
      } else {
        this.$message({message: "服务器错误!", type: "error"})
      }
    })
  },
  provide() {
    return {
      DataList: computed(() => this.DataList),
      SetTitle: this.SetTitle
    }
  },
  watch: {
    title(newVal: string, oldVal: string) {
      document.title = newVal;
    }
  },
  methods: {
    SetTitle(title: string) {
      this.title = title;
    }
  }
});
</script>

<template>
  <el-menu mode="horizontal">
    <el-image style="width: 40px; height: 40px; margin: 10px; margin-left: 30px" src='src/assets/logo.png' :fit="fit"/>
    <h3 style="margin-left: 30px">Web前端测试项目</h3>
    <el-menu-item style="margin-left: 70%">显示数据测试</el-menu-item>
  </el-menu>
  <div class="boxWapper">
    <ShowData class="showdata"/>
  </div>
</template>

<style scoped>
.boxWapper {
  margin-top: 20px;
  text-align: center;
}

.showdata {
  margin: 0 auto;
  border: 2px solid #eeeeee;
}
</style>
