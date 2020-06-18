import request from '@/utils/request'

export function searchUser(name) {
  return request({
    url: '/vue-element-admin/search/user',
    method: 'get',
    params: { name }
  })
}

<<<<<<< HEAD
export function transactionList(query) {
  return request({
    url: '/vue-element-admin/transaction/list',
    method: 'get',
    params: query
  })
}
=======
// export function transactionList(query) {
//   return request({
//     url: '/vue-element-admin/transaction/list',
//     method: 'get',
//     params: query
//   })
// }
>>>>>>> 1e57ee5de058d604cdcb1ccdcf2ba7a059393b7b
