<script lang="ts">

export default {
  inject: ['DataList', 'SetTitle'],
  mounted() {
    this.SetTitle("Web应用测试")
  },
  methods: {
    IfOut(s) {
      if (s)
        return "是"
      else
        return "否"
    }
  }
}
</script>

<template>
  <div class="main">
    <h2>学生名册</h2>
    <el-table :data="DataList" style="width: 100%">
      <el-table-column prop="stuName" label="姓名" width="180" />
      <el-table-column prop="sex" label="性别" width="180" />
      <el-table-column prop="id" label="ID" width="180" />
      <el-table-column label="是否离校" width="180">
        <template #default="scope">
          {{ IfOut(DataList[scope.$index].ifOut) }}
        </template>
      </el-table-column>
    </el-table>
  </div>
</template>

<style scoped>
.main {
  text-align: center;
  width: 720px;
}
</style>
